package com.epam.task01.logic;

import com.epam.task01.data.DataException;
import com.epam.task01.data.DataReader;
import com.epam.task01.entities.Array;
import com.epam.task01.parsing.ArrayParser;
import com.epam.task01.parsing.ArrayValidator;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {

    private DataReader dataReader;
    private ArrayValidator validator;
    private ArrayParser parser;

    public ArrayCreator(DataReader dataReader, ArrayValidator validator, ArrayParser parser) {
        this.dataReader = dataReader;
        this.validator = validator;
        this.parser = parser;
    }

    public List<Array> process(String filename) throws DataException {
        List<String> lines = dataReader.readData(filename);
        List<String> validLines = new ArrayList<>();
        for (String line : lines) {
            if (validator.validate(line)) {
                validLines.add(line);
            }
        }
        List<Array> arrays = new ArrayList<>();
        for (String line : validLines) {
            arrays.add(parser.parse(line));
        }
        return arrays;
    }

}
