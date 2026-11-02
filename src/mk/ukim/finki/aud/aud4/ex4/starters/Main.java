package mk.ukim.finki.aud.aud4.ex4.starters;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        FractionalKnapsack exercise = new FractionalKnapsack();

        double[] profits = {200, 150, 5, 80};
        double[] weights = {10, 20, 0.5, 5};
        double[] fractions = new double[profits.length];

        System.out.println("Suitcase example:");
        System.out.println("Maximum profit: " + exercise.maximizeProfit(profits, weights, 20, fractions));
        System.out.println("Profits: " + Arrays.toString(profits));
        System.out.println("Weights: " + Arrays.toString(weights));
        System.out.println("Fractions: " + Arrays.toString(fractions));

        double[] analysisProfits = {25, 24, 15};
        double[] analysisWeights = {18, 15, 10};
        double[] analysisFractions = new double[analysisProfits.length];

        System.out.println("Analysis example:");
        System.out.println("Maximum profit: "
                + exercise.maximizeProfit(analysisProfits, analysisWeights, 20, analysisFractions));
        System.out.println("Profits: " + Arrays.toString(analysisProfits));
        System.out.println("Weights: " + Arrays.toString(analysisWeights));
        System.out.println("Fractions: " + Arrays.toString(analysisFractions));
    }
}
