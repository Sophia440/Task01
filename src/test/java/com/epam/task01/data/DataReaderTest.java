package com.epam.task01.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DataReaderTest {

    private final static String PATH_TO_INPUT_FILE = "./src/test/resources/input_for_reader_test.txt";
    private final static DataReader reader = new DataReader();

    @Test
    public void testReadDataShouldSucceedWithProvidedPath() throws DataException {
        List<String> actualData = reader.readData(PATH_TO_INPUT_FILE);
        List<String> dataFromInputFile = Arrays.asList("1, 2, 3, 4, 5", "6k, 7, 8k, 9",
                "10   11   12   13", "2o0, 21, 22, 23");
        Assert.assertEquals(dataFromInputFile, actualData);
    }

    @Test
    public void testReadDataShouldFailIfFileDoesNotEndWithSymbolOfNewLine() throws DataException {
        List<String> actualData = reader.readData(PATH_TO_INPUT_FILE);
        List<String> dataFromInputFile = Arrays.asList("1, 2, 3, 4, 5", "6k, 7, 8k, 9",
                "10   11   12   13", "2o0, 21, 22, 23", "");
        Assert.assertEquals(dataFromInputFile, actualData);
    }

}
