package mk.ukim.finki.aud.aud2.ex3.solved;

import mk.ukim.finki.dataStructures.dll.DLL;
import mk.ukim.finki.dataStructures.dll.DLLNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, new String[]{"ovaa", "lista", "kje", "bide", "prevrtena"},
                new String[]{"prevrtena", "bide", "kje", "lista", "ovaa"});
        runCase(2, new String[]{}, new String[]{});
        runCase(3, new String[]{"only"}, new String[]{"only"});
        runCase(4, new String[]{"first", "second"}, new String[]{"second", "first"});
        runCase(5, new String[]{"a", "b", "a", "c"}, new String[]{"c", "a", "b", "a"});
    }

    private static void runCase(int number, String[] values, String[] expected)
    {
        System.out.printf("Case %d: %s%n", number, Arrays.toString(values));
        DLL<String> list = new DLL<>();
        for (String value : values)
            list.insertLast(value);
        List<DLLNode<String>> original = new ArrayList<>();
        for (DLLNode<String> node = list.getFirst(); node != null; node = node.succ)
            original.add(node);
        try
        {
            new MirrorList<String>().mirror(list);
            List<String> actual = new ArrayList<>();
            DLLNode<String> node = list.getFirst();
            boolean links = true;
            for (int i = 0; node != null && i <= values.length; i++)
            {
                links &= i < original.size() && node == original.get(original.size() - 1 - i);
                actual.add(node.element);
                links &= node.pred == (i == 0 ? null : original.get(original.size() - i));
                node = node.succ;
            }
            links &= node == null && actual.size() == original.size();
            links &= list.getLast() == (original.isEmpty() ? null : original.get(0));
            boolean passed = actual.equals(Arrays.asList(expected)) && links;
            System.out.printf("  Expected: %s | Actual: %s | Original nodes reversed: %s | %s%n",
                    Arrays.toString(expected), actual, links, passed ? "PASS" : "FAIL");
        }
        catch (RuntimeException error)
        {
            System.out.println("  FAIL: " + error);
        }
    }
}
