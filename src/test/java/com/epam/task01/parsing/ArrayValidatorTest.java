package com.epam.task01.parsing;

import org.junit.Assert;
import org.junit.Test;

public class ArrayValidatorTest {

    private ArrayValidator validator = new ArrayValidator();

    @Test
    public void testValidateShouldSucceedWithNegativeIntegers() {
        String stringWithNegativeIntegers = "-1, -2, 3, 4, -5";
        boolean actual = validator.validate(stringWithNegativeIntegers);
        Assert.assertTrue(actual);
    }

    @Test
    public void testValidateShouldSucceedWithDifferentDividingSymbols() {
        String stringWithDifferentDividingSymbols = "1;2/3    4_5";
        boolean actual = validator.validate(stringWithDifferentDividingSymbols);
        Assert.assertTrue(actual);
    }

}
