package mk.ukim.finki.aud.aud1.ex3.starters;

import mk.ukim.finki.dataStructures.sll.SLL;

public class Main
{
    public static void main(String[] args)
    {
        SLL<String> lista = new SLL<>();
        lista.insertLast("ovaa");
        lista.insertLast("lista");
        lista.insertLast("kje");
        lista.insertLast("bide");
        lista.insertLast("prevrtena");

        System.out.println("List before reversal: " + lista.toString());

        MirrorList<String> exercise = new MirrorList<>();
        exercise.mirror(lista);

        System.out.println("List after reversal: " + lista.toString());
    }
}
