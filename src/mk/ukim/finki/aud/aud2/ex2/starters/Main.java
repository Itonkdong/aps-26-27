package mk.ukim.finki.aud.aud2.ex2.starters;

import mk.ukim.finki.dataStructures.dll.DLL;

public class Main
{
    public static void main(String[] args)
    {
        DLL<Integer> list = new DLL<>();
        list.insertLast(4);
        list.insertLast(9);
        list.insertLast(4);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(8);
        list.insertLast(9);

        System.out.println("List before removing duplicates:");
        System.out.println(list.toString());

        RemoveDuplicates<Integer> exercise = new RemoveDuplicates<>();
        exercise.removeDuplicates(list);

        System.out.println("List after removing duplicates:");
        System.out.println(list.toString());
    }
}
