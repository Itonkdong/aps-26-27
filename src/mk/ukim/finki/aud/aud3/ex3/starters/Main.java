package mk.ukim.finki.aud.aud3.ex3.starters;

import mk.ukim.finki.dataStructures.queue.ArrayQueue;
import java.util.Arrays;
import java.util.Objects;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, new int[]{60, 90, 30}, null, 0);
        runCase(2, new int[]{60, 90, 45, 10}, "231003", 2);
        runCase(3, new int[]{181, 10}, "231001", 2);
        runCase(4, new int[]{20, 30}, null, 0);
        runCase(5, new int[]{}, null, 0);
    }

    private static void runCase(int number, int[] minutes, String expectedFirst, int expectedRemaining)
    {
        System.out.printf("Case %d: Service times %s%n", number, Arrays.toString(minutes));
        ArrayQueue<Student> queue = new ArrayQueue<>(Math.max(1, minutes.length));
        int totalMinutes = 0;
        for (int i = 0; i < minutes.length; i++)
        {
            String index = String.format("231%03d", i + 1);
            queue.enqueue(new Student(index, minutes[i]));
            totalMinutes += minutes[i];
            System.out.printf("  Student %s: %d minutes%n", index, minutes[i]);
        }
        System.out.println("  Total required time: " + totalMinutes + " minutes");
        try
        {
            Student first = new StudentServiceQueue().iterateStudentsQueue(queue);
            String actualFirst = first == null ? null : first.index;
            int actualRemaining = queue.size();
            System.out.printf("  First unserved | Expected: %s | Actual: %s | %s%n",
                    expectedFirst, actualFirst, Objects.equals(expectedFirst, actualFirst) ? "PASS" : "FAIL");
            System.out.printf("  Unserved count | Expected: %d | Actual: %d | %s%n",
                    expectedRemaining, actualRemaining, expectedRemaining == actualRemaining ? "PASS" : "FAIL");
        }
        catch (RuntimeException error)
        {
            System.out.println("  FAIL: " + error);
        }
    }
}
