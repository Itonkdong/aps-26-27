package mk.ukim.finki.aud.aud2.ex1.solved;

import mk.ukim.finki.dataStructures.dll.DLL;

import java.util.LinkedList;

/**
 * <h2>Exercise 1: Checking Whether a Doubly Linked List Is a Palindrome</h2>
 *
 * <h3>Description</h3>
 * <p>Given a doubly linked list with N nodes, each containing a number,
 * determine whether the list is a palindrome: does traversing it from
 * beginning to end produce the same sequence as traversing it from
 * end to beginning?</p>
 *
 * <h3>Variants</h3>
 * <p>Solve the exercise using both the custom {@link DLL} class and Java's
 * {@link LinkedList}. The methods return 1 for a palindrome and -1 otherwise.</p>
 *
 * <h3>Input and Output</h3>
 * <p>Main reads the number of elements followed by the integer elements
 * from standard input. It builds both list variants and prints their results
 * on separate lines: first the custom list, then the Java list.</p>
 *
 * <h3>Example</h3>
 * <pre>
 * Input:
 * 5
 * 1 2 3 2 1
 *
 * Expected output:
 * 1
 * 1
 * </pre>
 *
 * <h3>Source</h3>
 * <p>Arrays and Lists 2 - Doubly Linked Lists, classroom session 2,
 * exercise 1 (02_Nizi_Listi_2.pdf, page 15).</p>
 */
public class PalindromeDLL
{
    /**
     * Checks whether the custom doubly linked list is a palindrome.
     *
     * @param list the list of integers to check
     * @return 1 if the list is a palindrome, or -1 otherwise
     */
    public int isItPalindrome(DLL<Integer> list)
    {
        // TODO: Implement this method; 0 is a placeholder return value.
        return 0;
    }

    /**
     * Checks whether the Java linked list is a palindrome.
     *
     * @param list the list of integers to check
     * @return 1 if the list is a palindrome, or -1 otherwise
     */
    public int isItPalindrome(LinkedList<Integer> list)
    {
        // TODO: Implement this method; 0 is a placeholder return value.
        return 0;
    }
}
