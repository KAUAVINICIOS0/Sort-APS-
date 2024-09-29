package entities;
import java.util.*;
public class BubbleSort {

    public BubbleSort(){

    }

    public void sort(List<Integer> data) {
        int aux;
        for (int i = 0; i < data.size(); i++) {
            for (int j = i; j < data.size(); j++) {
                if (data.get(i) > data.get(j)) {
                    aux = data.get(i);
                    Collections.swap(data, i, j); // Trocando as posições
                }
            }
        }
    }
}