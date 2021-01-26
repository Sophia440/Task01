package com.epam.task01.view;

import com.epam.task01.entities.Array;

import java.util.List;

public class ConsoleArrayPrinter implements ArrayPrinter {

    public void print(final Array array) {
        List<Integer> elements = array.getElements();
        for (Integer element : elements) {
            System.out.println(element);
        }
    }

}
