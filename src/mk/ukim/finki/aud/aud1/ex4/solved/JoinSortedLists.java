package mk.ukim.finki.aud.aud1.ex4.solved;

import mk.ukim.finki.dataStructures.sll.SLL;

/**
 * <h2>Exercise 4: Merging Two Sorted Singly Linked Lists</h2>
 *
 * <h3>Description</h3>
 * <p>Given two singly linked lists whose nodes are sorted in ascending order,
 * write a function that merges them into a single sorted list. Use merging
 * to preserve the sorted order.</p>
 *
 * <h3>Input and Result</h3>
 * <p>The method receives two already sorted lists and returns a list
 * containing all their elements in ascending order.</p>
 *
 * <h3>Example from Main</h3>
 * <pre>
 * First list:  Ana-&gt;Bojana-&gt;Dejan
 * Second list: Andrijana-&gt;Biljana-&gt;Darko
 * Result:      Ana-&gt;Andrijana-&gt;Biljana-&gt;Bojana-&gt;Darko-&gt;Dejan
 * </pre>
 *
 * <h3>Source</h3>
 * <p>Arrays and Lists, classroom session 1, exercise 4
 * (01_Nizi_Listi.pdf, page 37).</p>
 *
 * @param <E> the type of elements, which must be comparable to each other
 */
public class JoinSortedLists<E extends Comparable<E>>
{
    /**
     * Merges the two sorted lists into a single sorted list.
     *
     * @param list1 the first list, sorted in ascending order
     * @param list2 the second list, sorted in ascending order
     * @return a sorted list containing all elements from both input lists
     */
    public SLL<E> join(SLL<E> list1, SLL<E> list2)
    {
        // TODO: Implement this method; null is a placeholder return value.
        return null;
    }
}
