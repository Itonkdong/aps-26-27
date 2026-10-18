package mk.ukim.finki.aud.aud1.ex2.solved;

import mk.ukim.finki.dataStructures.sll.SLL;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list:");
        int n = sc.nextInt();

        SLL<Integer> list = new SLL<>();
        System.out.println("Enter the list elements (integers):");
        for (int i = 0; i < n; i++)
        {
            list.insertLast(sc.nextInt());
        }

        EvenNumbersSLL exercise = new EvenNumbersSLL();
        System.out.println("Number of even elements in the list: "
                + exercise.evenNumbers(list));
    }
}
