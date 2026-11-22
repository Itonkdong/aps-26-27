package mk.ukim.finki.aud.aud1.ex1.solved;

import mk.ukim.finki.dataStructures.arrays.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, new String[]{"nb11", "b1", "b2", "nb12"}, new String[]{"nb21", "b1", "b2", "nb22"},
                new String[]{"nb11", "nb12"}, new String[]{"nb21", "nb22"});
        runCase(2, new Integer[]{10, 13, 7}, new Integer[]{5, 13, 3}, new Integer[]{10, 7}, new Integer[]{5, 3});
        runCase(3, new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}, new String[]{}, new String[]{});
        runCase(4, new Integer[]{1, 2, 3}, new Integer[]{4, 5, 6}, new Integer[]{1, 2, 3}, new Integer[]{4, 5, 6});
        runCase(5, new String[]{new String("same"), "left"}, new String[]{new String("same"), "right"},
                new String[]{"left"}, new String[]{"right"});
    }

    private static <E> void runCase(int number, E[] first, E[] second, E[] expectedFirst, E[] expectedSecond)
    {
        System.out.printf("Case %d: %s and %s%n", number, Arrays.toString(first), Arrays.toString(second));
        System.out.printf("  Expected: %s and %s%n", Arrays.toString(expectedFirst), Arrays.toString(expectedSecond));
        ChangeArrays<E> exercise = new ChangeArrays<>();
        Array<E> customFirst = new Array<>(Math.max(1, first.length));
        Array<E> customSecond = new Array<>(Math.max(1, second.length));
        for (E value : first)
            customFirst.insertLast(value);
        for (E value : second)
            customSecond.insertLast(value);
        try
        {
            exercise.compareAndChangeArrays(customFirst, customSecond);
            List<E> actualFirst = values(customFirst);
            List<E> actualSecond = values(customSecond);
            boolean passed = actualFirst.equals(Arrays.asList(expectedFirst)) && actualSecond.equals(Arrays.asList(expectedSecond));
            System.out.printf("  Array | Actual: %s and %s | %s%n", actualFirst, actualSecond, passed ? "PASS" : "FAIL");
        }
        catch (RuntimeException error)
        {
            System.out.println("  Array | FAIL: " + error);
        }
        ArrayList<E> standardFirst = new ArrayList<>(Arrays.asList(first));
        ArrayList<E> standardSecond = new ArrayList<>(Arrays.asList(second));
        try
        {
            exercise.compareAndChangeArrays(standardFirst, standardSecond);
            boolean passed = standardFirst.equals(Arrays.asList(expectedFirst)) && standardSecond.equals(Arrays.asList(expectedSecond));
            System.out.printf("  ArrayList | Actual: %s and %s | %s%n", standardFirst, standardSecond, passed ? "PASS" : "FAIL");
        }
        catch (RuntimeException error)
        {
            System.out.println("  ArrayList | FAIL: " + error);
        }
    }

    private static <E> List<E> values(Array<E> array)
    {
        List<E> values = new ArrayList<>();
        for (int i = 0; i < array.getSize(); i++)
            values.add(array.get(i));
        return values;
    }
}
