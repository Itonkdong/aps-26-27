package mk.ukim.finki.aud.aud2.ex3.solved;

import mk.ukim.finki.dataStructures.dll.DLL;

public class Main
{
    public static void main(String[] args)
    {
        DLL<String> list = new DLL<>();
        list.insertLast("ovaa");
        list.insertLast("lista");
        list.insertLast("kje");
        list.insertLast("bide");
        list.insertLast("prevrtena");

        System.out.println("List before reversal:");
        System.out.println(list.toString());

        MirrorList<String> exercise = new MirrorList<>();
        exercise.mirror(list);

        System.out.println("List after reversal:");
        System.out.println(list.toString());
    }
}
