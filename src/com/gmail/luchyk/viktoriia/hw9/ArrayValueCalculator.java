package com.gmail.luchyk.viktoriia.hw9;

public class ArrayValueCalculator {
    public static final int SIZE = 4;

    public static int doCalc(String[][] data) throws ArraySizeException, ArrayDataException {
        verify(data);
        return sum(data);
    }

    public static int doCalculation(String[][] data) {
        int result = 0;
        try {
            verify(data);
        } catch (ArraySizeException e) {
            System.out.printf("Incorrect size of the array. Should be %dx%d.\n", SIZE, SIZE);
        }

        try {
            result = sum(data);
        } catch (ArrayDataException e) {
            System.out.println("Incorrect value in the array. Only numbers should be used.");
            System.out.println(e);
        }

        return result;
    }

    private static void verify(String[][] data) throws ArraySizeException {
        if (data.length != SIZE) throw new ArraySizeException();
        else {
            for (String[] row : data) {
                if (row.length != SIZE) throw new ArraySizeException();
            }
        }
    }

    private static int sum(String[][] data) throws ArrayDataException {
        int result = 0;
        if (data.length > 0) {
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    try {
                        result += Integer.parseInt(data[i][j]);
                    } catch (NumberFormatException e) {
                        throw new ArrayDataException("The element in the cell[" + (i + 1) + "][" + (j + 1) + "] isn't a number.");
                    }
                }
            }
        }
        return result;
    }
}