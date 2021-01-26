package com.epam.task01.sorters;

import com.epam.task01.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

    private MergeSort mergeSort = new MergeSort();

    @Test
    public void testMergeSortShouldSucceedWhenArrayContainsDuplicateNumbers() {
        Array array = new Array(2, 6, 10, 0, 1, 7, 8, 6);
        Array expected = new Array(0, 1, 2, 6, 6, 7, 8, 10);
        Array actual = mergeSort.start(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMergeSortShouldSucceedWhenArrayContainsNegativeNumbers() {
        Array array = new Array(2, -6, -10, 0, 1, 7, 8, 6);
        Array expected = new Array(-10, -6, 0, 1, 2, 6, 7, 8);
        Array actual = mergeSort.start(array);
        Assert.assertEquals(expected, actual);
    }
}
