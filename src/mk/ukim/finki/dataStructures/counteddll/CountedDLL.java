package mk.ukim.finki.dataStructures.counteddll;

/**
 * A doubly linked list whose nodes also store occurrence counts.
 * Basic list operations are provided; grouping equal elements is left
 * to the classroom exercise.
 *
 * @param <E> the type of elements in the list
 */
public class CountedDLL<E>
{
    private CountedDLLNode<E> first, last;

    public CountedDLL()
    {
        // Construct an empty doubly linked list.
        this.first = null;
        this.last = null;
    }

    public void insertFirst(E o)
    {
        CountedDLLNode<E> ins = new CountedDLLNode<E>(o, null, first);
        if (first == null)
            last = ins;
        else
            first.pred = ins;
        first = ins;
    }

    public void insertLast(E o)
    {
        if (first == null)
            insertFirst(o);
        else
        {
            CountedDLLNode<E> ins = new CountedDLLNode<E>(o, last, null);
            last.succ = ins;
            last = ins;
        }
    }

    public void insertAfter(E o, CountedDLLNode<E> after)
    {
        if (after == last)
        {
            insertLast(o);
            return;
        }
        CountedDLLNode<E> ins = new CountedDLLNode<E>(o, after, after.succ);
        after.succ.pred = ins;
        after.succ = ins;
    }

    public void insertBefore(E o, CountedDLLNode<E> before)
    {
        if (before == first)
        {
            insertFirst(o);
            return;
        }
        CountedDLLNode<E> ins = new CountedDLLNode<E>(o, before.pred, before);
        before.pred.succ = ins;
        before.pred = ins;
    }

    public E deleteFirst()
    {
        if (first != null)
        {
            CountedDLLNode<E> tmp = first;
            first = first.succ;
            if (first != null) first.pred = null;
            if (first == null)
                last = null;
            return tmp.element;
        }
        else
            return null;
    }

    public E deleteLast()
    {
        if (first != null)
        {
            if (first.succ == null)
                return deleteFirst();
            else
            {
                CountedDLLNode<E> tmp = last;
                last = last.pred;
                last.succ = null;
                return tmp.element;
            }
        }
        else
            return null;
    }

    public E delete(CountedDLLNode<E> node)
    {
        if (node == first)
        {
            return deleteFirst();
        }
        if (node == last)
        {
            return deleteLast();
        }
        node.pred.succ = node.succ;
        node.succ.pred = node.pred;
        return node.element;

    }

    public CountedDLLNode<E> find(E o)
    {
        if (first != null)
        {
            CountedDLLNode<E> tmp = first;
            while (!tmp.element.equals(o) && tmp.succ != null)
                tmp = tmp.succ;
            if (tmp.element.equals(o))
            {
                return tmp;
            }
            else
            {
                System.out.println("The element is not in the list");
            }
        }
        else
        {
            System.out.println("The list is empty");
        }
        return null;
    }

    public void deleteList()
    {
        first = null;
        last = null;
    }

    public int getSize()
    {
        int listSize = 0;
        CountedDLLNode<E> tmp = first;
        while (tmp != null)
        {
            listSize++;
            tmp = tmp.succ;
        }
        return listSize;
    }

    @Override
    public String toString()
    {
        String ret = new String();
        if (first != null)
        {
            CountedDLLNode<E> tmp = first;
            ret += tmp.toString();
            while (tmp.succ != null)
            {
                tmp = tmp.succ;
                ret += "<->" + tmp.toString();
            }
        }
        else
            ret = "Empty list";
        return ret;
    }

    public String toStringR()
    {
        String ret = new String();
        if (last != null)
        {
            CountedDLLNode<E> tmp = last;
            ret += tmp.toString();
            while (tmp.pred != null)
            {
                tmp = tmp.pred;
                ret += "<->" + tmp.toString();
            }
        }
        else
            ret = "Empty list";
        return ret;
    }

    public CountedDLLNode<E> getFirst()
    {
        return first;
    }

    public CountedDLLNode<E> getLast()
    {

        return last;
    }

    /**
     * Sets the first node of the list.
     *
     * @param first the new first node, or {@code null} for an empty list
     */
    public void setFirst(CountedDLLNode<E> first)
    {
        this.first = first;
    }

    /**
     * Sets the last node of the list.
     *
     * @param last the new last node, or {@code null} for an empty list
     */
    public void setLast(CountedDLLNode<E> last)
    {
        this.last = last;
    }

    public void mirror()
    {

        CountedDLLNode<E> tmp = null;
        CountedDLLNode<E> current = first;
        last = first;
        while (current != null)
        {
            tmp = current.pred;
            current.pred = current.succ;
            current.succ = tmp;
            current = current.pred;
        }

        if (tmp != null && tmp.pred != null)
        {
            first = tmp.pred;
        }
    }
}
