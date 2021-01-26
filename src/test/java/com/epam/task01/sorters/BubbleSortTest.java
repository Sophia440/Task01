package com.epam.task01.sorters;

import com.epam.task01.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testBubbleSortShouldSucceedWhenArrayContainsDuplicateNumbers() {
        Array array = new Array(2, 6, 10, 0, 1, 7, 8, 6);
        Array expected = new Array(0, 1, 2, 6, 6, 7, 8, 10);
        Array actual = bubbleSort.start(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBubbleSortShouldSucceedWhenArrayContainsNegativeNumbers() {
        Array array = new Array(2, -6, -10, 0, 1, 7, 8, 6);
        Array expected = new Array(-10, -6, 0, 1, 2, 6, 7, 8);
        Array actual = bubbleSort.start(array);
        Assert.assertEquals(expected, actual);
    }

}
