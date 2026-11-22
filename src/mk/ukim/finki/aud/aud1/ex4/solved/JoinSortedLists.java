package mk.ukim.finki.aud.aud1.ex4.solved;

import mk.ukim.finki.dataStructures.sll.SLL;
import mk.ukim.finki.dataStructures.sll.SLLNode;

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

    public void addRest(SLL<E> result, SLLNode<E> current, SLLNode<E> fromWhere)
    {
        while (fromWhere != null)
        {
            if (current == null)
            {
                result.insertFirst(fromWhere.element);
                current = result.getFirst();
            }
            else
            {
                result.insertAfter(fromWhere.element, current);
                current = current.succ;
            }
            fromWhere = fromWhere.succ;
        }
    }

    /**
     * Merges the two sorted lists into a single sorted list.
     *
     * @param list1 the first list, sorted in ascending order
     * @param list2 the second list, sorted in ascending order
     * @return a sorted list containing all elements from both input lists
     */
    public SLL<E> join(SLL<E> list1, SLL<E> list2)
    {
        SLL<E> sorted = new SLL<>();
        SLLNode<E> currentFrom1 = list1.getFirst();
        SLLNode<E> currentFrom2 = list2.getFirst();

        if (currentFrom1 == null)
        {
            addRest(sorted, null, currentFrom2);
            return sorted;
        }
        if (currentFrom2 == null)
        {
            addRest(sorted, null, currentFrom1);
            return sorted;
        }

        if (currentFrom1.element.compareTo(currentFrom2.element) < 0)
        {
            sorted.insertFirst(currentFrom1.element);
            currentFrom1 = currentFrom1.succ;
        }
        else
        {
            sorted.insertFirst(currentFrom2.element);
            currentFrom2 = currentFrom2.succ;
        }

        SLLNode<E> current = sorted.getFirst();

        while (true)
        {
            if (currentFrom1 == null)
            {
                addRest(sorted, current, currentFrom2);
                return sorted;
            }

            if (currentFrom2 == null)
            {
                addRest(sorted, current, currentFrom1);
                return sorted;
            }

            if (currentFrom1.element.compareTo(currentFrom2.element) < 0)
            {
                sorted.insertAfter(currentFrom1.element, current);
                currentFrom1 = currentFrom1.succ;
                current = current.succ;
            }
            else
            {
                sorted.insertAfter(currentFrom2.element, current);
                currentFrom2 = currentFrom2.succ;
                current = current.succ;
            }
        }
    }
}
