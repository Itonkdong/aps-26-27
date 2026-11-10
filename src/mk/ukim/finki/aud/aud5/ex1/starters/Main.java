package mk.ukim.finki.aud.aud5.ex1.starters;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, 5, 2, 10);
        runCase(2, 0, 0, 1);
        runCase(3, 8, 0, 1);
        runCase(4, 8, 8, 1);
        runCase(5, 30, 15, 155117520);
        runCase(6, 100, 15, 253338471349988640L);
    }

    private static void runCase(int number, int n, int k, long expected)
    {
        long actual = new BinomialCoefficients().coefficient(n, k);
        System.out.printf("Case %d: C(%d, %d) | Expected: %d | Actual: %d | %s%n",
                number, n, k, expected, actual, actual == expected ? "PASS" : "FAIL");
    }
}
