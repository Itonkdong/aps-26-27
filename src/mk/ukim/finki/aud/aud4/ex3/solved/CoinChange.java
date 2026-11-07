package mk.ukim.finki.aud.aud4.ex3.solved;

/**
 * <h2>Exercise 3: Forming a Sum with the Fewest Coins</h2>
 *
 * <h3>Description</h3>
 * <p>Coins of 50, 10, 5, 2, and 1 denar are available in unlimited
 * quantities. For a given sum, calculate the smallest number of coins
 * needed to form it.</p>
 *
 * <h3>Input and Result</h3>
 * <p>The method receives the coin values, the sum, and an output array
 * for the number of coins used for each value. The output counts
 * correspond to the values in the coin array.</p>
 *
 * <h3>Example from Main</h3>
 * <pre>
 * Coin values: [50, 10, 5, 2, 1]
 * Sum: 93
 * Expected minimum number of coins: 7
 * Expected coin counts: [1, 4, 0, 1, 1]
 * </pre>
 *
 * <h3>Source</h3>
 * <p>Algorithms Techniques, problem 3
 * (presentations/eng/04_Algorithms_Techniques.pdf, pages 12-17).
 * The sum of 93 was added for testing.</p>
 */
public class CoinChange
{
    /**
     * Reorders the coin values.
     *
     * @param coins the coin values to sort in place
     */
    public void sortCoins(int[] coins)
    {
        for (int i = 0; i < coins.length; i++)
        {
            for (int j = i + 1; j < coins.length; j++)
            {
                if (coins[i] < coins[j])
                {
                    int tmp = coins[i];
                    coins[i] = coins[j];
                    coins[j] = tmp;
                }
            }
        }

    }

    /**
     * Forms the sum using the fewest coins of the specified denominations.
     *
     * @param coins the available denominations 50, 10, 5, 2, and 1;
     *              this array may be sorted in place
     * @param sum the nonnegative sum to form
     * @param coinCounts the output counts, with the same length as coins
     * @return the total number of coins used
     */
    public int minimumCoins(int[] coins, int sum, int[] coinCounts)
    {
        sortCoins(coins);
        int coinIndex = 0;

        while (sum > 0)
        {
            int currentCoin = coins[coinIndex];
            if (currentCoin > sum)
            {
                coinIndex ++;
                continue;
            }
            sum -= currentCoin;
            coinCounts[coinIndex] += 1;
        }

        int totalCoint = 0;
        for (int coinCount : coinCounts)
        {
            totalCoint += coinCount;
        }

        return totalCoint;
    }
}
