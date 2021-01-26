package com.epam.task01.data;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public List<String> readData(String filename) throws DataException {

        List<String> lines = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filename), "windows-1251"))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                lines.add(currentLine);
            }
        } catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        }
        return lines;

    }

}
