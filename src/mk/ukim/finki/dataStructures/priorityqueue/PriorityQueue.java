package mk.ukim.finki.dataStructures.priorityqueue;

import mk.ukim.finki.dataStructures.dll.DLLNode;
import mk.ukim.finki.dataStructures.queue.Queue;

import java.util.NoSuchElementException;


/**
 * A linked priority queue that removes the smallest element first.
 *
 * @param <E> the type of elements stored in the structure
 */
public class PriorityQueue<E extends Comparable<E>> implements Queue<E>
{

    // Queue representation:
    // length stores the number of elements.
    // Elements are stored in singly linked nodes.
    // front and rear point to the first and last nodes.
    DLLNode<E> front, rear;
    int length;
    PriorityQueueOrder order = PriorityQueueOrder.NATURAL;

    // Construct an empty queue.

    public PriorityQueue(PriorityQueueOrder priorityQueOrder)
    {
        order = priorityQueOrder;
        clear();
    }

    public PriorityQueue()
    {
        clear();
    }

    public boolean isEmpty()
    {
        // Return whether the queue is empty.
        return length == 0;
    }

    public int size()
    {
        // Return the number of elements in the queue.
        return length;
    }

    public E peek()
    {
        // Return the front element without removing it.
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }

        return front.element;
    }

    public void clear()
    {
        // Remove all elements from the queue.
        front = rear = null;
        length = 0;
    }

    public void enqueue(E x)
    {
        // Insert x into the queue.
        DLLNode<E> latest = new DLLNode<E>(x, null, null);
        DLLNode<E> iterator = front;

        if (isEmpty())
        {
            front = rear = latest;
        }
        else if (latest.element.compareTo(front.element) < 0)
        {
            latest.succ = front;
            front = latest;
        }
        else
        {
            while (iterator.succ != null)
            {
                // 2 [3] 4
                if (latest.element.compareTo(iterator.succ.element) < 0)
                {
                    latest.succ = iterator.succ;
                    latest.pred = iterator;

                    iterator.succ.pred = latest;
                    iterator.succ = latest;
                    length++;
                    return;
                }

                iterator = iterator.succ;
            }
            rear.succ = latest;
            latest.pred = rear;
            rear = latest;
        }

        length++;
    }

    public E dequeue()
    {
        // Remove and return the front element.
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }

        E highestPriority = null;

        if (order == PriorityQueueOrder.NATURAL)
        {
            highestPriority = front.element;
            front = front.succ;
            if (front == null)
            {
                rear = null;
            }
            else
            {
                front.pred = null;
            }
        }
        else
        {
            highestPriority = rear.element;
            rear = rear.pred;
            if (rear == null)
            {
                front = null;
            }
            else
            {
                rear.succ = null;
            }
        }
        length--;
        return highestPriority;

    }

    public String toString()
    {
        DLLNode<E> current = front;
        StringBuilder s = new StringBuilder();
        while (current != null)
        {
            s.append(current.element);
            s.append(" ");
            current = current.succ;
        }

        if (order == PriorityQueueOrder.REVERSE)
        {
            return s.reverse().substring(1);
        }

        return s.substring(0, s.length() - 1);
    }
}
