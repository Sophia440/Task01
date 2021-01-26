package com.epam.task01.parsing;

public class ArrayValidator {

    private static final String REGULAR_EXPRESSION_TO_SPLIT_LINE_INTO_NUMBERS = "[[\\s\\p{Punct}]&&[^-]]+";
    private static final String REGULAR_EXPRESSION_TO_VALIDATE_INTEGER_NUMBERS = "[+-]?\\d+";

    public boolean validate(String line) {
        String[] numbers = line.split(REGULAR_EXPRESSION_TO_SPLIT_LINE_INTO_NUMBERS);
        for (String number : numbers) {
            if (!number.matches(REGULAR_EXPRESSION_TO_VALIDATE_INTEGER_NUMBERS)) {
                return false;
            }
        }
        return true;
    }
}
