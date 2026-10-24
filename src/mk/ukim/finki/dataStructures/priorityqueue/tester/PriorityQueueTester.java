package mk.ukim.finki.dataStructures.priorityqueue.tester;

import mk.ukim.finki.dataStructures.priorityqueue.PriorityQueue;

public class PriorityQueueTester
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] values = {6, 9, 4, 7};
        for (int value : values)
        {
            queue.enqueue(value);
            System.out.println("Current queue: " + queue + " Next to remove: " + queue.peek());
        }

        System.out.println("Size: " + queue.size());
        System.out.println("Elements in priority order:");
        while (!queue.isEmpty())
        {
            System.out.println(queue.dequeue());
        }

        queue.enqueue(5);
        queue.clear();
        System.out.println("Empty after clear: " + queue.isEmpty());
    }
}
