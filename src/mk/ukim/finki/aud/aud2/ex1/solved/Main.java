package mk.ukim.finki.aud.aud2.ex1.solved;

import mk.ukim.finki.dataStructures.dll.DLL;
import java.util.Arrays;
import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, new int[]{1, 2, 3, 2, 1}, 1);
        runCase(2, new int[]{1000, 2000, 2000, 1000}, 1);
        runCase(3, new int[]{1, 2, 3}, -1);
        runCase(4, new int[]{9}, 1);
        runCase(5, new int[]{}, 1);
    }

    private static void runCase(int number, int[] values, int expected)
    {
        System.out.printf("Case %d: %s%n", number, Arrays.toString(values));
        DLL<Integer> custom = new DLL<>();
        LinkedList<Integer> standard = new LinkedList<>();
        for (int value : values)
        {
            custom.insertLast(value);
            standard.add(value);
        }
        PalindromeDLL exercise = new PalindromeDLL();
        try
        {
            int actual = exercise.isItPalindrome(custom);
            System.out.printf("  DLL | Expected: %d | Actual: %d | %s%n",
                    expected, actual, actual == expected ? "PASS" : "FAIL");
        }
        catch (RuntimeException error)
        {
            System.out.println("  DLL | FAIL: " + error);
        }
        try
        {
            int actual = exercise.isItPalindrome(standard);
            System.out.printf("  LinkedList | Expected: %d | Actual: %d | %s%n",
                    expected, actual, actual == expected ? "PASS" : "FAIL");
        }
        catch (RuntimeException error)
        {
            System.out.println("  LinkedList | FAIL: " + error);
        }
    }
}
