package mk.ukim.finki.aud.aud4.ex5.starters;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, 2, 10, 1024);
        runCase(2, 7, 0, 1);
        runCase(3, 0, 5, 0);
        runCase(4, -3, 3, -27);
        runCase(5, -2, 4, 16);
    }

    private static void runCase(int number, int base, int exponent, int expected)
    {
        System.out.printf("Case %d: Base %d, exponent %d%n", number, base, exponent);
        PowerCalculator exercise = new PowerCalculator();
        try
        {
            int actual = exercise.pow(base, exponent);
            System.out.printf("  Version 1 | Expected: %d | Actual: %d | %s%n",
                    expected, actual, actual == expected ? "PASS" : "FAIL");
        }
        catch (RuntimeException error)
        {
            System.out.println("  Version 1 | FAIL: " + error);
        }
        try
        {
            int actual = exercise.powWithRepeatedCalls(base, exponent);
            System.out.printf("  Version 2 | Expected: %d | Actual: %d | %s%n",
                    expected, actual, actual == expected ? "PASS" : "FAIL");
        }
        catch (RuntimeException error)
        {
            System.out.println("  Version 2 | FAIL: " + error);
        }
    }
}
