package mk.ukim.finki.aud.aud4.ex4.starters;

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
        // TODO: Implement this method.
    }

    /**
     * Selects fractions of items to maximize profit within the capacity.
     *
     * @param profits the item profits; this array may be reordered
     * @param weights the corresponding positive weights; this array may be reordered
     * @param capacity the available nonnegative weight capacity
     * @param fractions the output fractions, with the same length as profits
     * @return the maximum total profit
     */
    public double maximizeProfit(double[] profits, double[] weights, double capacity, double[] fractions)
    {
        // TODO: Implement this method.
        return 0.0;
    }
}
