package mk.ukim.finki.aud.aud1.ex1.starters;

import mk.ukim.finki.dataStructures.arrays.Array;

import java.util.ArrayList;

/**
 * <h2>Exercise 1: Removing Equal Elements at Matching Positions in Two Arrays</h2>
 *
 * <h3>Description</h3>
 * <p>Given two arrays of the same size, write a function that modifies both
 * arrays so that whenever they contain equal elements at the same position,
 * those elements are removed from both arrays.</p>
 *
 * <h3>Variants</h3>
 * <p>Solve the exercise using both the custom {@link Array} class and Java's
 * {@link ArrayList}. Both methods modify the arrays passed to them.</p>
 *
 * <h3>Examples from Main</h3>
 * <pre>
 * Before: {nb11,b1,b2,nb12} and {nb21,b1,b2,nb22}
 * After:  {nb11,nb12} and {nb21,nb22}
 *
 * Before: [10, 13, 7] and [5, 13, 3]
 * After:  [10, 7] and [5, 3]
 * </pre>
 *
 * <h3>Source</h3>
 * <p>Arrays and Lists, classroom session 1, exercise 1
 * (01_Nizi_Listi.pdf, page 10).</p>
 *
 * @param <E> the type of elements in the arrays
 */
public class ChangeArrays<E>
{
    /**
     * Removes equal elements at matching positions from both arrays.
     *
     * @param niza1 the first array
     * @param niza2 the second array, with the same initial size as the first
     */
    public void compareAndChangeArrays(Array<E> niza1, Array<E> niza2)
    {
        // TODO: Implement this method.
    }

    /**
     * Removes equal elements at matching positions from both arrays
     * represented by {@link ArrayList}.
     *
     * @param niza1 the first array
     * @param niza2 the second array, with the same initial size as the first
     */
    public void compareAndChangeArrays(ArrayList<E> niza1, ArrayList<E> niza2)
    {
        // TODO: Implement this method.
    }
}
