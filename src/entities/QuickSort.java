package entities;
import java.util.*;

public class QuickSort {

    public static void quickSort(List<Integer> data, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(data, begin, end);

            quickSort(data, begin, partitionIndex - 1);
            quickSort(data, partitionIndex + 1, end);
        }
    }

    private static int partition(List<Integer> data, int begin, int end) {
        int pivot = data.get(end);
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (data.get(j) <= pivot) {
                i++;

                int swapTemp = data.get(i);
                Collections.swap(data, i, j);
                Collections.swap(data, j, swapTemp);
            }
        }

        int swapTemp = data.get(i + 1);
        Collections.swap(data, i + 1, end);
        Collections.swap(data, end, swapTemp);
        return i + 1;
    }
}
