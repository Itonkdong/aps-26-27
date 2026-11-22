package mk.ukim.finki.aud.aud3.ex1.starters;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, "s x (s - a) x (s - b) x (s - c)", true);
        runCase(2, "{a + [b * (c - d)]}", true);
        runCase(3, "([)]", false);
        runCase(4, ")(", false);
        runCase(5, "((a + b)", false);
    }

    private static void runCase(int number, String expression, boolean expected)
    {
        System.out.printf("Case %d: %s%n", number, expression);
        BracketValidator exercise = new BracketValidator();
        try
        {
            boolean actual = exercise.hasValidBracketsArray(expression);
            System.out.printf("  Array variant | Expected: %s | Actual: %s | %s%n",
                    expected, actual, actual == expected ? "PASS" : "FAIL");
        }
        catch (RuntimeException error)
        {
            System.out.println("  Array variant | FAIL: " + error);
        }
        try
        {
            boolean actual = exercise.hasValidBracketsLinked(expression);
            System.out.printf("  Linked variant | Expected: %s | Actual: %s | %s%n",
                    expected, actual, actual == expected ? "PASS" : "FAIL");
        }
        catch (RuntimeException error)
        {
            System.out.println("  Linked variant | FAIL: " + error);
        }
    }
}
