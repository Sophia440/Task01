package com.epam.task01.sorters;

import com.epam.task01.entities.Array;

import java.util.List;

public class SelectionSort implements ArraySorter {
    @Override
    public Array start(Array array) {
        List<Integer> elements = array.getElements();
        selectionSort(elements);
        return new Array(elements);
    }

    private void selectionSort(List<Integer> elements) {
        int smallestElement;
        int smallestElementIndex;
        int size = elements.size();
        for (int i = 1; i < size; i++) {
            smallestElement = elements.get(i - 1);
            smallestElementIndex = i - 1;
            for (int j = i; j < size; j++) {
                if (elements.get(j) < smallestElement) {
                    smallestElement = elements.get(j);
                    smallestElementIndex = j;
                }
            }
            swap(elements,i - 1, smallestElementIndex);
        }
    }

    private void swap(List<Integer> elements, int sourceIndex, int destIndex) {
        int temp = elements.get(destIndex);
        elements.set(destIndex, elements.get(sourceIndex));
        elements.set(sourceIndex, temp);
    }
}
