package com.epam.task01.sorters;

import com.epam.task01.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

    private SelectionSort selectionSort = new SelectionSort();

    @Test
    public void testSelectionSortShouldSucceedWhenArrayContainsDuplicateNumbers() {
        Array array = new Array(2, 6, 10, 0, 1, 7, 8, 6);
        Array expected = new Array(0, 1, 2, 6, 6, 7, 8, 10);
        Array actual = selectionSort.start(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSelectionSortShouldSucceedWhenArrayContainsNegativeNumbers() {
        Array array = new Array(2, -6, -10, 0, 1, 7, 8, 6);
        Array expected = new Array(-10, -6, 0, 1, 2, 6, 7, 8);
        Array actual = selectionSort.start(array);
        Assert.assertEquals(expected, actual);
    }

}
