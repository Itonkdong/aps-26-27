package mk.ukim.finki.aud.aud1.ex4.starters;

import mk.ukim.finki.dataStructures.sll.SLL;
import mk.ukim.finki.dataStructures.sll.SLLNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, new String[]{"Ana", "Bojana", "Dejan"}, new String[]{"Andrijana", "Biljana", "Darko"},
                new String[]{"Ana", "Andrijana", "Biljana", "Bojana", "Darko", "Dejan"});
        runCase(2, new Integer[]{1, 3, 3}, new Integer[]{1, 2, 3}, new Integer[]{1, 1, 2, 3, 3, 3});
        runCase(3, new Integer[]{}, new Integer[]{-2, 0, 4}, new Integer[]{-2, 0, 4});
        runCase(4, new Integer[]{1, 2}, new Integer[]{}, new Integer[]{1, 2});
        runCase(5, new Integer[]{}, new Integer[]{}, new Integer[]{});
    }

    private static <E extends Comparable<E>> void runCase(int number, E[] first, E[] second, E[] expected)
    {
        System.out.printf("Case %d: %s and %s%n", number, Arrays.toString(first), Arrays.toString(second));
        SLL<E> firstList = new SLL<>();
        SLL<E> secondList = new SLL<>();
        for (E value : first)
            firstList.insertLast(value);
        for (E value : second)
            secondList.insertLast(value);
        try
        {
            SLL<E> result = new JoinSortedLists<E>().join(firstList, secondList);
            List<E> actual = null;
            boolean complete = false;
            if (result != null)
            {
                actual = new ArrayList<>();
                SLLNode<E> node = result.getFirst();
                while (node != null && actual.size() <= expected.length)
                {
                    actual.add(node.element);
                    node = node.succ;
                }
                complete = node == null;
            }
            boolean passed = complete && Arrays.asList(expected).equals(actual);
            System.out.printf("  Expected: %s | Actual: %s | %s%n", Arrays.toString(expected), actual, passed ? "PASS" : "FAIL");
        }
        catch (RuntimeException error)
        {
            System.out.println("  FAIL: " + error);
        }
    }
}
