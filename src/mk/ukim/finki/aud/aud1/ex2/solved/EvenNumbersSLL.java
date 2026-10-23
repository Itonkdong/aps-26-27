package mk.ukim.finki.aud.aud1.ex2.solved;

import mk.ukim.finki.dataStructures.sll.SLL;
import mk.ukim.finki.dataStructures.sll.SLLNode;

/**
 * <h2>Exercise 2: Counting Even Elements in a Singly Linked List</h2>
 *
 * <h3>Description</h3>
 * <p>Write a function that returns the number of even elements in a given
 * singly linked list of integers.</p>
 *
 * <h3>Input and Output</h3>
 * <p>Main reads the number of elements followed by the list elements from
 * standard input. It then prints the number of even elements.</p>
 *
 * <h3>Example</h3>
 * <pre>
 * Input:
 * 5
 * 4 5 6 7 9
 *
 * Expected number of even elements: 2
 * </pre>
 *
 * <h3>Source</h3>
 * <p>Arrays and Lists, classroom session 1, exercise 2
 * (01_Nizi_Listi.pdf, page 31).</p>
 */
public class EvenNumbersSLL
{
    /**
     * Counts the even elements in the given list.
     *
     * @param list a singly linked list of integers
     * @return the number of even elements, or 0 for an empty list
     */
    public int evenNumbers(SLL<Integer> list)
    {
        int numEven = 0 ;
        SLLNode<Integer> iterator = list.getFirst();
        while (iterator != null)
        {
            if (iterator.element % 2 == 0)
            {
                numEven ++ ;
            }
            iterator = iterator.succ;
        }
        return numEven;
    }
}
