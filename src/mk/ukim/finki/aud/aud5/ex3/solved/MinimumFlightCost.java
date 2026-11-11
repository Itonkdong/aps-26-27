package mk.ukim.finki.aud.aud5.ex3.solved;

/**
 * <h2>Exercise 3: Finding the Cheapest Flight Route</h2>
 *
 * <h3>Description</h3>
 * <p>A passenger travels from city 1, the westernmost city, to city n,
 * the easternmost city. Flights may only travel east, and there is a direct
 * flight from each city to every city east of it. Each flight has a ticket
 * price. Every city on the route, including the first and last, charges
 * an airport tax. Find the minimum total cost of reaching city n.</p>
 *
 * <h3>Example from Main</h3>
 * <pre>
 * Airport taxes: [2, 3, 1]
 * Ticket prices: 1 to 2 costs 4, 1 to 3 costs 15, 2 to 3 costs 5
 * Minimum cost: 15
 * </pre>
 *
 * <h3>Source</h3>
 * <p>04_Tehniki_Algoritmi_2.pdf, pages 16-22.</p>
 */
public class MinimumFlightCost
{
    /**
     * Finds the minimum total cost of the journey.
     *
     * @param taxes  airport taxes in west-to-east city order
     * @param prices ticket prices, where prices[i][j] is the price from city i to city j
     *               in zero-based array indices, and only entries with i less than j are used
     * @return the minimum total of ticket prices and airport taxes
     */
    public int minimumCost(int[] taxes, int[][] prices)
    {
        int[] dp = new int[taxes.length];
        dp[0] = taxes[0];
        for (int city = 1; city < dp.length; city++)
        {
            int min = Integer.MAX_VALUE;
            for (int previousCity = 0; previousCity <= city - 1; previousCity++)
            {
                int total = dp[previousCity] + prices[previousCity][city];
                if (total < min)
                {
                    min = total;
                }
            }
            dp[city] = taxes[city] + min;
        }

        return dp[dp.length - 1];
    }
}
