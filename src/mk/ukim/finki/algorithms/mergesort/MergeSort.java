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
        int i = left;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= right)
        {
            if (values[i] < values[j])
            {
                temporary[k] = values[i];
                i++;
            }
            else
            {
                temporary[k] = values[j];
                j++;
            }
            k++;
        }

        while (i <= middle)
        {
            temporary[k] = values[i];
            i++;
            k++;
        }

        while (j <= right)
        {
            temporary[k] = values[j];
            j++;
            k++;
        }

        for (k = 0; k < temporary.length; k++)
        {
            values[left + k] = temporary[k];
        }
    }
}
