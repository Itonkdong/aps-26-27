package mk.ukim.finki.dataStructures.queue.tester;

import mk.ukim.finki.dataStructures.queue.ArrayQueue;
import mk.ukim.finki.dataStructures.queue.Queue;

public class ArrayQueueTester
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new ArrayQueue<>(3);
        System.out.println("Initially empty: " + queue.isEmpty());
        queue.enqueue(4);
        queue.enqueue(9);
        queue.enqueue(13);
        System.out.println("Size after three insertions: " + queue.size());
        System.out.println("Front without removal: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        queue.enqueue(7);
        System.out.println("Elements in removal order:");
        while (!queue.isEmpty())
        {
            System.out.println(queue.dequeue());
        }
        queue.enqueue(5);
        queue.clear();
        System.out.println("Empty after clear: " + queue.isEmpty());
        queue.enqueue(8);
        System.out.println("Dequeue after reuse: " + queue.dequeue());
    }
}
