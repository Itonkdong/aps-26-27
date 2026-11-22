package mk.ukim.finki.aud.aud4.ex2.solved;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, 2576);
        runCase(2, 0, 0, 0, 7, true);
        runCase(3, 0, 2, 7, 2, true);
        runCase(4, 0, 7, 7, 0, true);
        runCase(5, 0, 0, 1, 2, false);
    }

    private static void runCase(int number, int expected)
    {
        System.out.printf("Case %d: Ordered placements on an 8-by-8 board%n", number);
        try
        {
            int actual = new NonAttackingQueens().countPlacements();
            System.out.printf("  Expected: %d | Actual: %d | %s%n",
                    expected, actual, actual == expected ? "PASS" : "FAIL");
        }
        catch (RuntimeException error)
        {
            System.out.println("  FAIL: " + error);
        }
    }

    private static void runCase(int number, int row1, int column1, int row2, int column2, boolean expected)
    {
        System.out.printf("Case %d: Queens at (%d, %d) and (%d, %d)%n", number, row1, column1, row2, column2);
        try
        {
            boolean actual = new NonAttackingQueens().areAttacking(row1, column1, row2, column2);
            System.out.printf("  Attacking | Expected: %s | Actual: %s | %s%n",
                    expected, actual, actual == expected ? "PASS" : "FAIL");
        }
        catch (RuntimeException error)
        {
            System.out.println("  FAIL: " + error);
        }
    }
}
