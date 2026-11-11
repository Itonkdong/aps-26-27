package mk.ukim.finki.aud.aud5.extra1.solved;

/**
 * <h2>Extra Exercise 1: Forming a Sum with the Fewest Coins</h2>
 *
 * <h3>Description</h3>
 * <p>Coins of 50, 10, 5, 2, and 1 denar are available in unlimited
 * quantities. Given a sum, use dynamic programming to find the minimum
 * number of coins needed to form it.</p>
 *
 * <h3>Input and Result</h3>
 * <p>The method receives the denominations, the target sum, and an output
 * array for the number of coins used per denomination. The counts follow
 * the order of the denominations in the input array.</p>
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
 * <p>Adapted from {@code aud4/ex3}.</p>
 */
public class CoinChange
{
    /**
     * Finds the fewest coins needed to form the target sum.
     *
     * @param coins      the available denominations
     * @param sum        the nonnegative sum to form
     * @param coinCounts the output counts, in the order of the denominations
     * @return the total number of coins used
     */
    public int minimumCoins(int[] coins, int sum, int[] coinCounts)
    {
        int[] dp = new int[sum + 1];

        for (int currentSum = 1; currentSum <= sum; currentSum++)
        {
            int min = Integer.MAX_VALUE;
            for (int coin : coins)
            {
                int remainingSum = currentSum - coin;
                if (remainingSum < 0) continue;
                int neededCoinForTheRemainingSum = dp[remainingSum];
                if (neededCoinForTheRemainingSum < min)
                {
                    min = neededCoinForTheRemainingSum;
                }
            }
            dp[currentSum] = 1 + min;

        }
        return dp[sum];
    }
}
