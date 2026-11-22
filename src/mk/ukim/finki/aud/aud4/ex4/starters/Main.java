package mk.ukim.finki.aud.aud4.ex4.starters;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, new double[]{200, 150, 5, 80}, new double[]{10, 20, 0.5, 5}, 20, 318.75);
        runCase(2, new double[]{25, 24, 15}, new double[]{18, 15, 10}, 20, 31.5);
        runCase(3, new double[]{6, 10, 12}, new double[]{1, 2, 3}, 6, 28);
        runCase(4, new double[]{10, 20}, new double[]{2, 4}, 0, 0);
        runCase(5, new double[]{10}, new double[]{4}, 1, 2.5);
    }

    private static void runCase(int number, double[] inputProfits, double[] inputWeights,
                                double capacity, double expected)
    {
        System.out.printf("Case %d: Profits %s, weights %s, capacity %s%n",
                number, Arrays.toString(inputProfits), Arrays.toString(inputWeights), capacity);
        double[] profits = inputProfits.clone();
        double[] weights = inputWeights.clone();
        double[] fractions = new double[profits.length];
        try
        {
            double actual = new FractionalKnapsack().maximizeProfit(profits, weights, capacity, fractions);
            double usedWeight = 0;
            double representedProfit = 0;
            boolean validFractions = true;
            for (int i = 0; i < fractions.length; i++)
            {
                validFractions &= Double.isFinite(fractions[i]) && fractions[i] >= -1e-9 && fractions[i] <= 1 + 1e-9;
                usedWeight += fractions[i] * weights[i];
                representedProfit += fractions[i] * profits[i];
            }
            validFractions &= Double.isFinite(usedWeight) && usedWeight <= capacity + 1e-9
                    && Math.abs(representedProfit - actual) <= 1e-9 * Math.max(1, Math.abs(actual));
            boolean passed = Double.isFinite(actual) && Math.abs(expected - actual) <= 1e-9 * Math.max(1, expected)
                    && validFractions;
            System.out.printf("  Expected profit: %s | Actual profit: %s | %s%n",
                    expected, actual, passed ? "PASS" : "FAIL");
            System.out.printf("  Returned profits: %s | Weights: %s | Fractions: %s | Valid selection: %s%n",
                    Arrays.toString(profits), Arrays.toString(weights), Arrays.toString(fractions), validFractions);
        }
        catch (RuntimeException error)
        {
            System.out.println("  FAIL: " + error);
        }
    }
}
