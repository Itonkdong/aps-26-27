package mk.ukim.finki.aud.aud3.ex1.starters;

import mk.ukim.finki.dataStructures.stack.ArrayStack;
import mk.ukim.finki.dataStructures.stack.LinkedStack;

/**
 * <h2>Exercise 1: Validating Brackets in an Expression</h2>
 *
 * <h3>Description</h3>
 * <p>Check whether the brackets in an expression are correct. An expression
 * has correct brackets when:</p>
 * <ul>
 *     <li>Every opening bracket has a corresponding closing bracket later
 *     in the expression.</li>
 *     <li>Every closing bracket has a corresponding opening bracket earlier
 *     in the expression.</li>
 *     <li>Every subexpression enclosed by a matching pair of brackets also
 *     has correctly balanced and nested brackets.</li>
 * </ul>
 * <p>Handle parentheses {@code ()}, square brackets {@code []}, and braces
 * {@code {}}. Other characters do not affect bracket validity.</p>
 *
 * <h3>Variants</h3>
 * <p>Implement the array-backed variant using {@link ArrayStack} and the
 * linked variant using {@link LinkedStack}. The matching-bracket helper
 * is also left for you to implement.</p>
 *
 * <h3>Examples</h3>
 * <pre>
 * s x (s - a) x (s - b) x (s - c)     valid
 * s x (s - a) x (s - b x (s - c)      invalid
 * s x (s - a) x s - b) x (s - c)      invalid
 * </pre>
 * <p>Main tests the first expression with both variants. Both should report
 * valid brackets after implementation; the current scaffold returns false.</p>
 *
 * <h3>Source</h3>
 * <p>One-Dimensional Data Structures, exercise 1
 * (03_Ednodimenzionalni_podatocni_strukturi.pdf, pages 15-17).</p>
 */
public class BracketValidator
{
    /**
     * Checks bracket validity using an array-backed stack.
     *
     * @param expression the expression to check
     * @return whether all brackets are balanced and correctly nested
     */
    public boolean hasValidBracketsArray(String expression)
    {
        // TODO: Implement this method; false is a placeholder return value.
        return false;
    }

    /**
     * Checks bracket validity using a linked stack.
     *
     * @param expression the expression to check
     * @return whether all brackets are balanced and correctly nested
     */
    public boolean hasValidBracketsLinked(String expression)
    {
        // TODO: Implement this method; false is a placeholder return value.
        return false;
    }

    /**
     * Checks whether the two characters form a matching bracket pair.
     *
     * @param left an opening bracket
     * @param right a closing bracket
     * @return whether the brackets have matching types
     */
    public boolean areMatching(char left, char right)
    {
        // TODO: Implement this method; false is a placeholder return value.
        return false;
    }
}
