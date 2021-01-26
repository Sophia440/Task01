package com.epam.task01.sorters;

import com.epam.task01.entities.Array;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements ArraySorter {
    @Override
    public Array start(Array array) {
        List<Integer> elements = array.getElements();
        List<Integer> sorted = mergeSort(elements);
        return new Array(sorted);
    }

    private List<Integer> mergeSort(List<Integer> elements) {
        List<Integer> leftSubList = new ArrayList<>();
        List<Integer> rightSubList = new ArrayList<>();
        int center;

        if (elements.size() == 1) {
            return elements;
        } else {
            center = elements.size() / 2;
            for (int i = 0; i < center; i++) {
                leftSubList.add(elements.get(i));
            }

            for (int i = center; i < elements.size(); i++) {
                rightSubList.add(elements.get(i));
            }

            leftSubList = mergeSort(leftSubList);
            rightSubList = mergeSort(rightSubList);

            merge(leftSubList, rightSubList, elements);
        }
        return elements;
    }

    private void merge(List<Integer> leftSubList, List<Integer> rightSubList, List<Integer> wholeList) {
        int leftIndex = 0;
        int rightIndex = 0;
        int wholeIndex = 0;
        int leftSize = leftSubList.size();
        int rightSize = rightSubList.size();

        while ((leftIndex < leftSize) && (rightIndex < rightSize)) {
            Integer leftElement = leftSubList.get(leftIndex);
            Integer rightElement = rightSubList.get(rightIndex);
            if (leftElement < rightElement) {
                wholeList.set(wholeIndex, leftElement);
                leftIndex++;
            } else {
                wholeList.set(wholeIndex, rightElement);
                rightIndex++;
            }
            wholeIndex++;
        }

        List<Integer> rest;
        int restIndex;
        if (leftIndex >= leftSize) {
            rest = rightSubList;
            restIndex = rightIndex;
        } else {
            rest = leftSubList;
            restIndex = leftIndex;
        }

        for (int i = restIndex; i < rest.size(); i++) {
            wholeList.set(wholeIndex, rest.get(i));
            wholeIndex++;
        }
    }

}
