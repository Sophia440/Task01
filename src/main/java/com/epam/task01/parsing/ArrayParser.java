package com.epam.task01.parsing;

import com.epam.task01.entities.Array;

public class ArrayParser {

    private static final String REGULAR_EXPRESSION_TO_SPLIT_LINE_INTO_NUMBERS = "[[\\s\\p{Punct}]&&[^-]]+";

    public Array parse(String data) {
        String[] numbers = data.split(REGULAR_EXPRESSION_TO_SPLIT_LINE_INTO_NUMBERS);
        Array parsedArray = new Array();
        int numberConvertedFromString;
        for (String number : numbers) {
            numberConvertedFromString = Integer.parseInt(number);
            parsedArray.addElement(numberConvertedFromString);
        }
        return parsedArray;
    }

}
