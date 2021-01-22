package com.epam.task01.logic;

import com.epam.task01.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayLogicTest {

    private ArrayLogic arrayLogic = new ArrayLogic();

    private static final double DELTA = 1e-15;

    @Test
    public void testFindMaxShouldFindMaxWhenPositiveNumbersApplied() {
        //given
        Array array = new Array(1, 2, 3);

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(3, actual);

    }

    @Test
    public void testFindMaxShouldFindMaxWhenNegativeNumbersApplied() {
        //given
        Array array = new Array(-1, -3, -2);

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(-1, actual);

    }

    @Test
    public void testFindMaxShouldReturnZeroIfArrayIsEmpty() {
        //given
        Array array = new Array();

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(0, actual);

    }

    @Test
    public void testFindMinShouldFindMinWhenPositiveNumbersApplied() {
        //given
        Array array = new Array(1, 2, 3);

        //when
        int actual = arrayLogic.findMin(array);

        //then
        Assert.assertEquals(1, actual);

    }

    @Test
    public void testFindMinShouldFindMinWhenNegativeNumbersApplied() {
        //given
        Array array = new Array(-1, -3, -2);

        //when
        int actual = arrayLogic.findMin(array);

        //then
        Assert.assertEquals(-3, actual);

    }

    @Test
    public void testFindMinShouldReturnZeroIfArrayIsEmpty() {
        //given
        Array array = new Array();

        //when
        int actual = arrayLogic.findMin(array);

        //then
        Assert.assertEquals(0, actual);

    }

    @Test
    public void testFindSumShouldSucceed() {
        //given
        Array array = new Array(1, 2, 3, 4);

        //when
        int actual = arrayLogic.findSum(array);

        //then
        Assert.assertEquals(10, actual);

    }

    @Test
    public void testFindSumShouldFail() {
        //given
        Array array = new Array(1, 2, 3, -6);

        //when
        int actual = arrayLogic.findSum(array);

        //then
        Assert.assertEquals(1, actual);

    }

    @Test
    public void testFindAverageShouldFindAverageIfArrayIsNotEmpty() {
        //given
        Array array = new Array(1, 3, 2);

        //when
        double actual = arrayLogic.findAverage(array);

        //then
        Assert.assertEquals(2.0, actual, DELTA);

    }

    @Test
    public void testFindAverageShouldReturnZeroIfArrayIsEmpty() {
        //given
        Array array = new Array();

        //when
        double actual = arrayLogic.findAverage(array);

        //then
        Assert.assertEquals(0.0, actual, DELTA);

    }

    @Test
    public void testFindAverageShouldFindAverageWhenAverageIsNotInteger() {
        //given
        Array array = new Array(1, 1, 2);

        //when
        double actual = arrayLogic.findAverage(array);

        //then
        Assert.assertEquals(1.3333333333333333, actual, DELTA);

    }

    @Test
    public void testCountPositiveElements() {
        //given
        Array array = new Array(1, -2, 3, 4, 0);

        //when
        int actual = arrayLogic.countPositiveElements(array);

        //then
        Assert.assertEquals(3, actual);

    }

    @Test
    public void testCountNegativeElements() {
        //given
        Array array = new Array(-1, -2, -3, -4, 0);

        //when
        int actual = arrayLogic.countNegativeElements(array);

        //then
        Assert.assertEquals(4, actual);

    }

}
