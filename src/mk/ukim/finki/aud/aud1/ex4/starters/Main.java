package mk.ukim.finki.aud.aud1.ex4.starters;

import mk.ukim.finki.dataStructures.sll.SLL;

public class Main
{
    public static void main(String[] args)
    {
        SLL<String> lista1 = new SLL<>();
        lista1.insertLast("Ana");
        lista1.insertLast("Bojana");
        lista1.insertLast("Dejan");

        SLL<String> lista2 = new SLL<>();
        lista2.insertLast("Andrijana");
        lista2.insertLast("Biljana");
        lista2.insertLast("Darko");

        JoinSortedLists<String> exercise = new JoinSortedLists<>();
        System.out.println(exercise.join(lista1, lista2));
    }
}
