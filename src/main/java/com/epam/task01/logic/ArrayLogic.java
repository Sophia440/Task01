package com.epam.task01.logic;

import com.epam.task01.entities.Array;

import java.util.List;

public class ArrayLogic {

    public int findMax(Array array) {
        List<Integer> elements = array.getElements();
        if(!elements.isEmpty()) {
            int max = elements.get(0);
            for (Integer element : elements) {
                if (max < element) {
                    max = element;
                }
            }
            return max;
        }
        return 0;
    }

    public int findMin(Array array) {
        List<Integer> elements = array.getElements();
        if(!elements.isEmpty()) {
            int min = elements.get(0);
            for (Integer element : elements) {
                if (min > element) {
                    min = element;
                }
            }
            return min;
        }
        return 0;
    }

    public int findSum(Array array) {
        int sum = 0;
        List<Integer> elements = array.getElements();
        for (Integer element : elements) {
            sum = sum + element;
        }
        return sum;
    }

    public double findAverage(Array array) {
        double sum = findSum(array);
        List<Integer> elements = array.getElements();
        if (elements.isEmpty()) {
            return 0.0;
        } else {
            int arraySize = elements.size();
            return sum / arraySize;
        }
    }

    public int countPositiveElements(Array array) {
        int count = 0;
        List<Integer> elements = array.getElements();
        for (Integer element : elements) {
            if (element > 0) {
                count++;
            }
        }
        return count;
    }

    public int countNegativeElements(Array array) {
        int count = 0;
        List<Integer> elements = array.getElements();
        for (Integer element : elements) {
            if (element < 0) {
                count++;
            }
        }
        return count;
    }

}
