package mk.ukim.finki.aud.aud2.ex2.solved;

import mk.ukim.finki.dataStructures.dll.DLL;

/**
 * <h2>Exercise 2: Removing Duplicate Nodes</h2>
 *
 * <h3>Description</h3>
 * <p>Write a program that removes duplicate nodes from an arbitrary doubly
 * linked list. Keep the first occurrence of each distinct element and
 * preserve the order of the remaining nodes.</p>
 *
 * <h3>Data Structure</h3>
 * <p>Use the shared {@link DLL} implementation. The method modifies the
 * given list.</p>
 *
 * <h3>Example from Main</h3>
 * <pre>
 * Input elements: 4, 9, 4, 4, 5, 8, 9
 *
 * Expected list after implementation:
 * 4&lt;-&gt;9&lt;-&gt;5&lt;-&gt;8
 * </pre>
 *
 * <h3>Source</h3>
 * <p>Adapted for the standard DLL from Arrays and Lists 2 - Doubly Linked
 * Lists, classroom session 2, exercise 2
 * (02_Nizi_Listi_2.pdf, pages 20-23).</p>
 *
 * @param <E> the comparable type of elements in the list
 */
public class RemoveDuplicates<E extends Comparable<E>>
{
    /**
     * Removes duplicate nodes while preserving each element's first occurrence.
     *
     * @param list the list from which to remove duplicate nodes
     */
    public void removeDuplicates(DLL<E> list)
    {
        // TODO: Implement duplicate removal.
    }
}
