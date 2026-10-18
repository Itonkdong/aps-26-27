package mk.ukim.finki.aud.aud2.ex3.starters;

import mk.ukim.finki.dataStructures.dll.DLL;

/**
 * <h2>Exercise 3: Reversing a Doubly Linked List</h2>
 *
 * <h3>Description</h3>
 * <p>Write a function (method) that reverses a given doubly linked list.</p>
 *
 * <h3>Expected Behavior</h3>
 * <p>The method modifies the given list by reversing the links between its
 * existing nodes and updating its first and last nodes. After the call,
 * traversal in either direction must follow the reversed list order.</p>
 *
 * <h3>Example from Main</h3>
 * <pre>
 * Before: ovaa&lt;-&gt;lista&lt;-&gt;kje&lt;-&gt;bide&lt;-&gt;prevrtena
 * After:  prevrtena&lt;-&gt;bide&lt;-&gt;kje&lt;-&gt;lista&lt;-&gt;ovaa
 * </pre>
 *
 * <h3>Source</h3>
 * <p>Arrays and Lists 2 - Doubly Linked Lists, classroom session 2,
 * exercise 3 (02_Nizi_Listi_2.pdf, page 24).</p>
 *
 * @param <E> the type of elements in the list
 */
public class MirrorList<E>
{
    /**
     * Reverses the list and updates both of its endpoints.
     * Empty lists and single-node lists remain unchanged.
     *
     * @param list the list to reverse
     */
    public void mirror(DLL<E> list)
    {
        // TODO: Implement the link reversal in this class.
    }
}
