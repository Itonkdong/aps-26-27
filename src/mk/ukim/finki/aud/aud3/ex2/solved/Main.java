package mk.ukim.finki.aud.aud3.ex2.solved;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, "5  9 + 2 * 6 5 * +", 58.0);
        runCase(2, "6 2 -", 4.0);
        runCase(3, "5 2 /", 2.5);
        runCase(4, "3 4 x 2 +", 14.0);
        runCase(5, "4 +", null);
    }

    private static void runCase(int number, String expression, Double expected)
    {
        System.out.printf("Case %d: %s%n", number, expression);
        try
        {
            Double actual = new PostfixEvaluator().evaluateExpression(expression);
            boolean passed = expected == null ? actual == null
                    : actual != null && Double.isFinite(actual) && Math.abs(expected - actual) <= 1e-9;
            System.out.printf("  Expected: %s | Actual: %s | %s%n", expected, actual, passed ? "PASS" : "FAIL");
        }
        catch (RuntimeException error)
        {
            System.out.println("  FAIL: " + error);
        }
    }
}
