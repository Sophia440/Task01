package com.epam.task01;

import com.epam.task01.entities.Array;
import com.epam.task01.view.ArrayPrinter;
import com.epam.task01.view.ConsoleArrayPrinter;

public class Main {

    public static void main(String[] args) {

        Array array = new Array(1, 2, 3);

        ArrayPrinter printer = new ConsoleArrayPrinter();
        printer.print(array);

    }

}
