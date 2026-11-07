package mk.ukim.finki.aud.aud4.ex4.solved;

/**
 * <h2>Exercise 4: Maximizing Profit with a Fractional Knapsack</h2>
 *
 * <h3>Description</h3>
 * <p>A student is going on a trip and can take a suitcase weighing at most
 * 20 kg. Decide what to pack to maximize the total value of the items
 * without exceeding the weight limit.</p>
 * <pre>
 * Item                    Profit   Weight (kg)
 * Clothes                 200      10
 * Books                   150      20
 * Games and cards           5       0.5
 * CD or MP3 player         80       5
 * </pre>
 *
 * <h3>Fractional Variant</h3>
 * <p>An item may be divided: its selected fraction can be any value from
 * 0 to 1. Each item is available once, up to its full weight.</p>
 *
 * <h3>Input and Result</h3>
 * <p>The arrays contain corresponding profits and weights. Return the
 * maximum total profit and fill the output array with the selected
 * fractions. Fractions correspond to the items in the profit and weight
 * arrays.</p>
 *
 * <h3>Examples from Main</h3>
 * <pre>
 * Suitcase example above, capacity 20:
 * Expected maximum profit: 318.75
 *
 * Analysis example from the presentation:
 * Profits:  [25, 24, 15]
 * Weights:  [18, 15, 10]
 * Capacity: 20
 * Expected maximum profit: 31.5
 * </pre>
 *
 * <h3>Source</h3>
 * <p>Algorithms Techniques, problem 4, fractional variant
 * (presentations/eng/04_Algorithms_Techniques.pdf, pages 18-25).</p>
 */
public class FractionalKnapsack
{
    /**
     * Reorders the corresponding profit and weight arrays together.
     *
     * @param profits the item profits to reorder in place
     * @param weights the corresponding positive weights, reordered together
     *                with profits
     */
    public void sortByRatio(double[] profits, double[] weights)
    {
        double[] ratio = new double[profits.length];
        for (int i = 0; i < ratio.length; i++)
        {
            ratio[i] = profits[i] / weights[i];
        }

        for (int i = 0; i < ratio.length; i++)
        {
            for (int j = i + 1; j < ratio.length; j++)
            {
                if (ratio[i] < ratio[j])
                {
                    double tmp = ratio[i];
                    ratio[i] = ratio[j];
                    ratio[j] = tmp;

                    tmp = profits[i];
                    profits[i] = profits[j];
                    profits[j] = tmp;

                    tmp = weights[i];
                    weights[i] = weights[j];
                    weights[j] = tmp;
                }
            }
        }
    }

    /**
     * Selects fractions of items to maximize profit within the capacity.
     *
     * @param profits   the item profits; this array may be reordered
     * @param weights   the corresponding positive weights; this array may be reordered
     * @param capacity  the available nonnegative weight capacity
     * @param fractions the output fractions, with the same length as profits
     * @return the maximum total profit
     */
    public double maximizeProfit(double[] profits, double[] weights, double capacity, double[] fractions)
    {
        double totalProfit = 0;
        sortByRatio(profits, weights);
        for (int i = 0; i < profits.length; i++)
        {
            if (weights[i] <= capacity)
            {
                fractions[i] = 1;
                capacity -= weights[i];
                totalProfit += fractions[i] * profits[i];
            }
            else
            {
                fractions[i] = capacity / weights[i];
                totalProfit += fractions[i] * profits[i];
                break;

            }

        }
        return totalProfit;
    }
}
