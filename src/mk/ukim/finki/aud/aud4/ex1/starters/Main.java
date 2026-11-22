package mk.ukim.finki.aud.aud4.ex1.starters;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, new double[][]{{0, 0}, {3, 4}, {1, 0}}, 1.0);
        runCase(2, new double[][]{{0, 0}, {3, 4}}, 5.0);
        runCase(3, new double[][]{{2, 3}, {2, 3}, {7, 8}}, 0.0);
        runCase(4, new double[][]{{-1.5, -1.5}, {-0.5, -0.5}, {2, 2}}, 1.4142135623730951);
        runCase(5, new double[][]{{0, 0}, {200000, 0}, {500000, 0}}, 200000.0);
    }

    private static void runCase(int number, double[][] coordinates, double expected)
    {
        System.out.printf("Case %d: Points %s%n", number, Arrays.deepToString(coordinates));
        Point[] points = new Point[coordinates.length];
        for (int i = 0; i < coordinates.length; i++)
            points[i] = new Point(coordinates[i][0], coordinates[i][1]);
        try
        {
            double actual = new ClosestPoints().minimumDistance(points);
            boolean passed = Double.isFinite(actual) && Math.abs(actual - expected) <= 1e-9 * Math.max(1, expected);
            System.out.printf("  Expected: %s | Actual: %s | %s%n", expected, actual, passed ? "PASS" : "FAIL");
        }
        catch (RuntimeException error)
        {
            System.out.println("  FAIL: " + error);
        }
    }
}
