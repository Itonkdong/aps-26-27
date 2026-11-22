package mk.ukim.finki.aud.aud6.ex1.solved;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        String[] example = {"20.7.1976", "16.7.1988", "18.7.1966", "5.6.1988"};
        runCase(1, example, 7, "3");
        runCase(2, example, 12, "Empty");
        runCase(3, new String[]{"1.1.2000"}, 1, "1");
        runCase(4, new String[]{"31.12.1999", "1.1.2000", "5.12.1980", "22.6.1975", "12.12.2012"}, 12, "3");
        runCase(5, new String[]{}, 6, "Empty");
    }

    private static void runCase(int number, String[] birthDates, int month, String expected)
    {
        String actual = new Birthdays().countByMonth(birthDates, month);
        System.out.printf("Case %d: Birth dates %s, month %d%n", number, Arrays.toString(birthDates), month);
        System.out.printf("  Expected: %s | Actual: %s | %s%n",
                expected, actual, expected.equals(actual) ? "PASS" : "FAIL");
    }
}
