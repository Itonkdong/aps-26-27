package mk.ukim.finki.aud.aud1.ex1.solved;


import mk.ukim.finki.dataStructures.arrays.Array;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
//        Array<String> niza1 = new Array<String>(4);
//        niza1.insertLast("nb11");
//        niza1.insertLast("b1");
//        niza1.insertLast("b2");
//        niza1.insertLast("nb12");
//
//        Array<String> niza2 = new Array<String>(4);
//        niza2.insertLast("nb21");
//        niza2.insertLast("b1");
//        niza2.insertLast("b2");
//        niza2.insertLast("nb22");
//
//        System.out.println("Arrays before calling the method: ");
//        System.out.println(niza1.toString());
//        System.out.println(niza2.toString());
//
//        ChangeArrays<String> pom = new ChangeArrays<String>();
//        pom.compareAndChangeArrays(niza1, niza2);
//
//        System.out.println("Arrays after calling the method: ");
//        System.out.println(niza1.toString());
//        System.out.println(niza2.toString());

        ArrayList<Integer> niza3 = new ArrayList<Integer>(3);
        niza3.add(10);
        niza3.add(13);
        niza3.add(7);

        ArrayList<Integer> niza4 = new ArrayList<Integer>(3);
        niza4.add(5);
        niza4.add(13);
        niza4.add(3);

        System.out.println("Arrays before calling the method: ");
        System.out.println(niza3.toString());
        System.out.println(niza4.toString());

        ChangeArrays<Integer> pom2 = new ChangeArrays<Integer>();
        pom2.compareAndChangeArrays(niza3, niza4);

        System.out.println("Arrays after calling the method: ");
        System.out.println(niza3.toString());
        System.out.println(niza4.toString());

    }
}
