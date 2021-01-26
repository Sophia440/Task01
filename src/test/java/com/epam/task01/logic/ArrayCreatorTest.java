package com.epam.task01.logic;

import com.epam.task01.ArrayCreator;
import com.epam.task01.data.DataException;
import com.epam.task01.data.DataReader;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private static final List<String> TEST_DATA = Arrays.asList("1 2 3", "3g 4 6");

    @Test
    public void testProcess() throws DataException {

//        DataReader reader = Mockito.mock(DataReader.class);
//        when(reader.readData(anyString())).thenReturn(TEST_DATA);
//
//        ArrayCreator director = new ArrayCreator(reader);


    }
}
