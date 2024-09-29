package application;

import entities.BubbleSort;
import entities.MergeSort;
import entities.QuickSort;

import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Criando os dados
        final int hectares = 20000;
        List<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < hectares; i++) {
            data.add(i);
        }

        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();

        // Embaralhando
        Collections.shuffle(data);

        // BubbleSort
        long timeStartBubbleSort = System.currentTimeMillis();
        bubbleSort.sort(data);
        long timeEndBubbleSort = System.currentTimeMillis();
        System.out.println("Tempo total: " + (timeEndBubbleSort - timeStartBubbleSort));

        // Embaralhando
        Collections.shuffle(data);

        // MergeSort
        long timeStartMergeSort = System.currentTimeMillis();
        mergeSort.mergeSort(data, data.size());
        long timeEndMergeSort = System.currentTimeMillis();
        System.out.println("Tempo total: " + (timeEndMergeSort - timeStartMergeSort));


        // Embaralhando
        Collections.shuffle(data);

        // QuickSort
        long timeStartQuickSort = System.currentTimeMillis();
        quickSort.quickSort(data, 0, data.size()-1);
        long timeEndQuickSort = System.currentTimeMillis();
        System.out.println("Tempo total: " + (timeEndQuickSort - timeStartQuickSort));
    }
}