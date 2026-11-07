package mk.ukim.finki.aud.aud4.ex5.solved;

/**
 * <h2>Exercise 5: Calculating a Power with Divide and Conquer</h2>
 *
 * <h3>Description</h3>
 * <p>Write a function that calculates the n-th power of a number using
 * divide and conquer.</p>
 *
 * <h3>Example from Main</h3>
 * <pre>
 * Base: 2
 * Exponent: 10
 * Expected result for both methods: 1024
 * </pre>
 *
 * <h3>Source</h3>
 * <p>Algorithms Techniques, problem 5
 * (presentations/eng/04_Algorithms_Techniques.pdf, pages 35-39).
 * The base and exponent were added for testing.</p>
 */
public class PowerCalculator
{
    /**
     * Calculates a power using divide and conquer.
     *
     * @param base     the integer base
     * @param exponent the nonnegative exponent
     * @return base raised to exponent
     */
    public int pow(int base, int exponent)
    {
        if (exponent == 0) return 1;
        if (exponent == 1) return base;

        int half = exponent / 2;
        int otherHalf = exponent - half;

        return pow(base, otherHalf) * pow(base, half);
    }

    /**
     * Calculates a power using the second variant.
     *
     * @param base     the integer base
     * @param exponent the nonnegative exponent
     * @return base raised to exponent
     */
    public int powWithRepeatedCalls(int base, int exponent)
    {
        if (exponent == 0) return 1;
        if (exponent == 1) return base;

        int half = exponent / 2;
        int leftResult = powWithRepeatedCalls(base, half);
        if (exponent % 2 == 0)
        {
            return leftResult * leftResult;
        }
        else
        {
            return leftResult * leftResult * base;
        }
    }
}
