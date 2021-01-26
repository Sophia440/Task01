package com.epam.task01.entities;

import java.util.*;

public class Array {

    private final List<Integer> elements;

    public Array() {
        this.elements = new ArrayList<>();
    }

    public Array(Integer... elements) {
        this.elements = new ArrayList<>();
        this.elements.addAll(Arrays.asList(elements));
    }

    public Array(List<Integer> elements) {
        this.elements = elements;
    }

    public List<Integer> getElements() {
        return elements;
    }

    public void addElement(Integer element) {
        this.elements.add(element);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Array array = (Array) o;
        List<Integer> arrayElements = array.getElements();
        return elements.equals(arrayElements);
    }

    @Override
    public int hashCode() {
        return elements.hashCode();
    }
}
