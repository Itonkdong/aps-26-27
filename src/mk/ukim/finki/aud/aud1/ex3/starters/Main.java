package mk.ukim.finki.aud.aud1.ex3.starters;

import mk.ukim.finki.dataStructures.sll.SLL;
import mk.ukim.finki.dataStructures.sll.SLLNode;
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
        SLL<String> list = new SLL<>();
        for (String value : values)
            list.insertLast(value);
        List<SLLNode<String>> original = new ArrayList<>();
        for (SLLNode<String> node = list.getFirst(); node != null; node = node.succ)
            original.add(node);
        try
        {
            new MirrorList<String>().mirror(list);
            List<String> actual = new ArrayList<>();
            SLLNode<String> node = list.getFirst();
            boolean links = true;
            for (int i = 0; node != null && i <= values.length; i++)
            {
                links &= i < original.size() && node == original.get(original.size() - 1 - i);
                actual.add(node.element);

                node = node.succ;
            }
            links &= node == null && actual.size() == original.size();

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
