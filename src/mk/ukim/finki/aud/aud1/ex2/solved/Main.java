package mk.ukim.finki.aud.aud1.ex2.solved;

import mk.ukim.finki.dataStructures.sll.SLL;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, new int[]{4, 5, 6, 7, 9}, 2);
        runCase(2, new int[]{}, 0);
        runCase(3, new int[]{1, 3, 5}, 0);
        runCase(4, new int[]{2, 4, 6}, 3);
        runCase(5, new int[]{0, -2, -3, 7, 10}, 3);
    }

    private static void runCase(int number, int[] values, int expected)
    {
        System.out.printf("Case %d: %s%n", number, Arrays.toString(values));
        SLL<Integer> list = new SLL<>();
        for (int value : values)
            list.insertLast(value);
        try
        {
            int actual = new EvenNumbersSLL().evenNumbers(list);
            System.out.printf("  Expected: %d | Actual: %d | %s%n", expected, actual, actual == expected ? "PASS" : "FAIL");
        }
        catch (RuntimeException error)
        {
            System.out.println("  FAIL: " + error);
        }
    }
}
