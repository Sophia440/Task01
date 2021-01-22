package com.epam.task01.logic;

import com.epam.task01.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayLogicTest {

    private ArrayLogic arrayLogic = new ArrayLogic();

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
        Array array = new Array(-1,-3, -2);

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(-1, actual);

    }

}
