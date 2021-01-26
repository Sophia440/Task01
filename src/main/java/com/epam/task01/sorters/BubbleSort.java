package com.epam.task01.sorters;

import com.epam.task01.entities.Array;

import java.util.List;

public class BubbleSort implements ArraySorter {
    @Override
    public Array start(Array array) {
        List<Integer> elements = array.getElements();
        bubbleSort(elements);
        return new Array(elements);
    }

    private void bubbleSort(List<Integer> elements) {
        Integer temp;
        boolean sorted = false;
        int size = elements.size();
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < size - 1; i++) {
                Integer leftElement = elements.get(i);
                Integer rightElement = elements.get(i + 1);
                if (leftElement.compareTo(rightElement) > 0) {
                    temp = leftElement;
                    elements.set(i, rightElement);
                    elements.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }
}
