package mk.ukim.finki.aud.aud2.ex1.solved;

import mk.ukim.finki.dataStructures.dll.DLL;

import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DLL<Integer> customList = new DLL<>();
        LinkedList<Integer> javaList = new LinkedList<>();

        for (int i = 0; i < n; i++)
        {
            int value = in.nextInt();
            customList.insertLast(value);
            javaList.add(value);
        }
        in.close();

        PalindromeDLL exercise = new PalindromeDLL();
        System.out.println(exercise.isItPalindrome(customList));
        System.out.println(exercise.isItPalindrome(javaList));
    }
}
