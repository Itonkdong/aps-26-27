package mk.ukim.finki.aud.aud5.ex5.solved;

/**
 * <h2>Exercise 5: Longest Common Subsequence</h2>
 *
 * <h3>Description</h3>
 * <p>Given two strings, find a longest common subsequence and give its length.</p>
 *
 * <h3>Example from Main</h3>
 * <pre>
 * First string: ggcaccacg
 * Second string: acggcggatacg
 * Length: 7
 * One longest common subsequence: ggcaacg
 * </pre>
 *
 * <h3>Source</h3>
 * <p>04_Tehniki_Algoritmi_2.pdf, pages 32-38.</p>
 */
public class LongestCommonSubsequence
{
    /**
     * Finds the length of a longest common subsequence.
     *
     * @param first  the first string
     * @param second the second string
     * @return the length of a longest common subsequence
     */
    public int length(String first, String second)
    {
        int[][] dp = new int[first.length() + 1][second.length() + 1];

        for (int i = 1; i <= first.length(); i++)
        {
            int adjustedI = i - 1;
            for (int j = 1; j <= second.length(); j++)
            {
                int adjustedJ = j - 1;
                if (first.charAt(adjustedI) == second.charAt(adjustedJ))
                {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[first.length()][second.length()];

    }

    /**
     * Finds a longest common subsequence.
     *
     * @param first  the first string
     * @param second the second string
     * @return a longest common subsequence of the two strings
     */
    public String find(String first, String second)
    {
        // TODO: Implement this method.
        return "";
    }
}
