package mk.ukim.finki.dataStructures.counteddll;

/**
 * A doubly linked node that also stores an element's occurrence count.
 *
 * @param <E> the type of element stored in the node
 */
public class CountedDLLNode<E>
{
    public E element;
    public CountedDLLNode<E> pred, succ;

    /** The number of occurrences represented by this node, initially 1. */
    public int occurrenceCount;

    public CountedDLLNode(E element, CountedDLLNode<E> pred, CountedDLLNode<E> succ)
    {
        this.element = element;
        this.pred = pred;
        this.succ = succ;
        this.occurrenceCount = 1;
    }

    @Override
    public String toString()
    {
        return element.toString() + " (count: " + occurrenceCount + ")";
    }
}
