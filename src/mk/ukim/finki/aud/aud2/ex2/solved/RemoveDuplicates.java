package mk.ukim.finki.aud.aud2.ex2.solved;

import mk.ukim.finki.dataStructures.counteddll.CountedDLL;

/**
 * <h2>Exercise 2: Removing Duplicate Nodes and Counting Occurrences</h2>
 *
 * <h3>Description</h3>
 * <p>Write a program that removes duplicate nodes from an arbitrary doubly
 * linked list. In addition to its element, each node stores the number of
 * occurrences of that element.</p>
 *
 * <h3>Data Structure</h3>
 * <p>Use {@link CountedDLL}, whose nodes have an {@code occurrenceCount}
 * field initialized to 1. The list's string representation includes the
 * occurrence count for each node.</p>
 *
 * <h3>Expected Behavior</h3>
 * <p>Keep one node for each distinct element, in order of first appearance,
 * and record its total number of occurrences in the original list.
 * The method modifies the given list.</p>
 *
 * <h3>Example from Main</h3>
 * <pre>
 * Input elements: 4, 9, 4, 4, 5, 8, 9
 *
 * Expected list:
 * 4 (count: 3)&lt;-&gt;9 (count: 2)&lt;-&gt;5 (count: 1)&lt;-&gt;8 (count: 1)
 * </pre>
 *
 * <h3>Source</h3>
 * <p>Arrays and Lists 2 - Doubly Linked Lists, classroom session 2,
 * exercise 2 (02_Nizi_Listi_2.pdf, pages 20-23).</p>
 *
 * @param <E> the type of elements in the list
 */
public class RemoveDuplicates<E>
{
    /**
     * Removes duplicate nodes and updates the occurrence counts of the
     * remaining nodes.
     *
     * @param list the list containing the elements to group and count
     */
    public void removeDuplicatesAndCount(CountedDLL<E> list)
    {
        // TODO: Implement duplicate removal and occurrence counting.
    }
}
