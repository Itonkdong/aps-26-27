package mk.ukim.finki.algorithms.mergesort.tester;

import mk.ukim.finki.algorithms.mergesort.MergeSort;

import java.util.Arrays;

public class MergeSortTester
{
    public static void main(String[] args)
    {
        int[] values = {7, 2, 9, 4, 1, 5};
        System.out.println("Before sorting: " + Arrays.toString(values));

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(values);

        System.out.println("After sorting: " + Arrays.toString(values));
    }
}
