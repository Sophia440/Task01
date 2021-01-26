package com.epam.task01.logic;

import com.epam.task01.data.DataException;
import com.epam.task01.data.DataReader;
import com.epam.task01.entities.Array;
import com.epam.task01.parsing.ArrayParser;
import com.epam.task01.parsing.ArrayValidator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private static final List<String> TEST_DATA = Arrays.asList("1 2 3", "3g 4 6");
    private ArrayValidator validator = new ArrayValidator();
    private ArrayParser parser = new ArrayParser();

    @Test
    public void testProcessShouldSucceedWithProvidedTestData() throws DataException {

        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readData(anyString())).thenReturn(TEST_DATA);
        ArrayCreator creator = new ArrayCreator(reader, validator, parser);
        List<Array> actual = creator.process(anyString());
        List<Array> expected = new ArrayList<>();
        List<Integer> elementsOfExpected = Arrays.asList(1, 2, 3);
        expected.add(new Array(elementsOfExpected));
        Assert.assertEquals(expected, actual);

    }
}
