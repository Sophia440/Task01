package com.epam.task01.parsing;

import com.epam.task01.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayParserTest {

    private ArrayParser parser = new ArrayParser();

    @Test
    public void testParseShouldSucceedWithNegativeIntegers() {
        String stringWithNegativeIntegers = "-1, -2, 3, 4, -5";
        Array actual = parser.parse(stringWithNegativeIntegers);
        Array array = new Array(-1, -2, 3, 4, -5);
        Assert.assertEquals(array, actual);
    }

    @Test
    public void testParseShouldSucceedWithDifferentDividingSymbols() {
        String stringWithDifferentDividingSymbols = "1;2/3    4_5";
        Array actual = parser.parse(stringWithDifferentDividingSymbols);
        Array array = new Array(1, 2, 3, 4, 5);
        Assert.assertEquals(array, actual);
    }

}
