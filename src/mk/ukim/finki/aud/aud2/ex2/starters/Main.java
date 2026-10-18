package mk.ukim.finki.aud.aud2.ex2.starters;

import mk.ukim.finki.dataStructures.counteddll.CountedDLL;

public class Main
{
    public static void main(String[] args)
    {
        CountedDLL<Integer> list = new CountedDLL<>();
        list.insertLast(4);
        list.insertLast(9);
        list.insertLast(4);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(8);
        list.insertLast(9);

        System.out.println("List before removing duplicates and counting occurrences:");
        System.out.println(list.toString());

        RemoveDuplicates<Integer> exercise = new RemoveDuplicates<>();
        exercise.removeDuplicatesAndCount(list);

        System.out.println("List after removing duplicates and counting occurrences:");
        System.out.println(list.toString());
    }
}
