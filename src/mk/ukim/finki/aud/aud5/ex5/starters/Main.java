package mk.ukim.finki.aud.aud5.ex5.starters;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, "ggcaccacg", "acggcggatacg", "ggcaacg");
        runCase(2, "abc", "abc", "abc");
        runCase(3, "abc", "XYZ", "");
        runCase(4, "", "abc", "");
        runCase(5, "abc", "bac", "ac");
    }

    private static void runCase(int number, String first, String second, String example)
    {
        System.out.printf("Case %d: '%s' and '%s'%n", number, first, second);
        LongestCommonSubsequence exercise = new LongestCommonSubsequence();
        int expectedLength = example.length();
        int actualLength = exercise.length(first, second);
        String actual = exercise.find(first, second);
        boolean valid = actual != null && actual.length() == expectedLength
                && isSubsequence(actual, first) && isSubsequence(actual, second);
        System.out.printf("  Length | Expected: %d | Actual: %d | %s%n",
                expectedLength, actualLength, actualLength == expectedLength ? "PASS" : "FAIL");
        System.out.printf("  Subsequence | Example: '%s' | Actual: '%s' | %s%n",
                example, actual, valid ? "PASS" : "FAIL");
    }

    private static boolean isSubsequence(String candidate, String text)
    {
        int matched = 0;
        for (int i = 0; i < text.length() && matched < candidate.length(); i++)
        {
            if (candidate.charAt(matched) == text.charAt(i))
            {
                matched++;
            }
        }
        return matched == candidate.length();
    }
}
