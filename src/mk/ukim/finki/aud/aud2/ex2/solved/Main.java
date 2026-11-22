package mk.ukim.finki.aud.aud2.ex2.solved;

import mk.ukim.finki.dataStructures.dll.DLL;
import mk.ukim.finki.dataStructures.dll.DLLNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, new Integer[]{4, 9, 4, 4, 5, 8, 9}, new Integer[]{4, 9, 5, 8});
        runCase(2, new Integer[]{1, 2, 3}, new Integer[]{1, 2, 3});
        runCase(3, new Integer[]{7, 7, 7}, new Integer[]{7});
        runCase(4, new Integer[]{}, new Integer[]{});
        runCase(5, new Integer[]{1, 2, 1, 3, 2, 1}, new Integer[]{1, 2, 3});
    }

    private static void runCase(int number, Integer[] values, Integer[] expected)
    {
        System.out.printf("Case %d: %s%n", number, Arrays.toString(values));
        DLL<Integer> list = new DLL<>();
        for (Integer value : values)
            list.insertLast(value);
        try
        {
            new RemoveDuplicates<Integer>().removeDuplicates(list);
            checkList(list, expected, values.length);
        }
        catch (RuntimeException error)
        {
            System.out.println("  FAIL: " + error);
        }
    }

    private static void checkList(DLL<Integer> list, Integer[] expected, int limit)
    {
        List<Integer> forward = new ArrayList<>();
        DLLNode<Integer> current = list.getFirst();
        DLLNode<Integer> previous = null;
        boolean links = true;
        while (current != null && forward.size() <= limit)
        {
            links &= current.pred == previous;
            forward.add(current.element);
            previous = current;
            current = current.succ;
        }
        links &= current == null && previous == list.getLast();
        List<Integer> backward = new ArrayList<>();
        current = list.getLast();
        while (current != null && backward.size() <= limit)
        {
            backward.add(current.element);
            current = current.pred;
        }
        List<Integer> expectedBackward = new ArrayList<>(Arrays.asList(expected));
        Collections.reverse(expectedBackward);
        links &= current == null && backward.equals(expectedBackward);
        boolean passed = forward.equals(Arrays.asList(expected)) && links;
        System.out.printf("  Expected: %s | Actual: %s | Valid links: %s | %s%n",
                Arrays.toString(expected), forward, links, passed ? "PASS" : "FAIL");
    }
}
