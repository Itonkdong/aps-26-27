package mk.ukim.finki.dataStructures.stack.tester;

import mk.ukim.finki.dataStructures.stack.LinkedStack;
import mk.ukim.finki.dataStructures.stack.Stack;

public class LinkedStackTester
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new LinkedStack<>();
        System.out.println("Initially empty: " + stack.isEmpty());
        stack.push(4);
        stack.push(9);
        stack.push(13);
        System.out.println("Size after three pushes: " + stack.size());
        System.out.println("Top without removal: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("New top: " + stack.peek());
        stack.clear();
        System.out.println("Empty after clear: " + stack.isEmpty());
        stack.push(7);
        System.out.println("Pop after reuse: " + stack.pop());
    }
}
