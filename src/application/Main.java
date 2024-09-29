package application;

import entities.BubbleSort;
import entities.MergeSort;

import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        final int hectares = 20000;
        List<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < hectares; i++) {
            data.add(i);
        }

        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();

        //Embaralhando
        Collections.shuffle(data);

        // BubbleSort
        long timeStartBubbleSort = System.currentTimeMillis();
        bubbleSort.sort(data);
        long timeEndBubbleSort = System.currentTimeMillis();
        System.out.println("Tempo total: " + (timeEndBubbleSort - timeStartBubbleSort));

        //Embaralhando
        Collections.shuffle(data);

        // MergeSort
        long timeStartMergeSort = System.currentTimeMillis();
        mergeSort.mergeSort(data, data.size());
        long timeEndMergeSort = System.currentTimeMillis();
        System.out.println("Tempo total: " + (timeEndMergeSort - timeStartMergeSort));

    }
}