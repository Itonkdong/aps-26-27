package mk.ukim.finki.algorithms.mergesort;

/**
 * Sorts integer arrays in ascending order using merge sort.
 *
 * <p>Source: Algorithms Techniques, merge sort example
 * (aud/presentations/eng/04_Algorithms_Techniques.pdf, pages 31-33).</p>
 */
public class MergeSort
{
    /**
     * Sorts the given array in place.
     *
     * @param values the array to sort
     */
    public void sort(int[] values)
    {
        mergeSort(values, 0, values.length - 1);
    }

    private void mergeSort(int[] values, int left, int right)
    {
        if (left >= right)
            return;

        int middle = left + (right - left) / 2;
        mergeSort(values, left, middle);
        mergeSort(values, middle + 1, right);
        merge(values, left, middle, right);
    }

    private void merge(int[] values, int left, int middle, int right)
    {
        int[] temporary = new int[right - left + 1];
        int leftArrayIndex = left;
        int rightArrayIndex = middle + 1;
        int sortedArrayIndex = 0;

        while (leftArrayIndex <= middle && rightArrayIndex <= right)
        {
            if (values[leftArrayIndex] < values[rightArrayIndex])
            {
                temporary[sortedArrayIndex] = values[leftArrayIndex];
                leftArrayIndex++;
            }
            else
            {
                temporary[sortedArrayIndex] = values[rightArrayIndex];
                rightArrayIndex++;
            }
            sortedArrayIndex++;
        }

        while (leftArrayIndex <= middle)
        {
            temporary[sortedArrayIndex] = values[leftArrayIndex];
            leftArrayIndex++;
            sortedArrayIndex++;
        }

        while (rightArrayIndex <= right)
        {
            temporary[sortedArrayIndex] = values[rightArrayIndex];
            rightArrayIndex++;
            sortedArrayIndex++;
        }

        for (int i = 0; i < temporary.length; i++)
        {
            values[left + i] = temporary[i];
        }
    }
}
