package com.gmail.luchyk.viktoriia.hw9;

public class Main {
    public static void main(String[] args) {
        doCalcTest();
//        doCalculationTest();
    }

    private static void doCalcTest() {
        System.out.println("*** Case: squared, empty ***");
        String[][] squaredEmpty = new String[4][4];
        exceptionHandling(squaredEmpty);
        System.out.println();

        System.out.println("*** Case: not squared, empty ***");
        String[][] notSquaredEmpty = new String[5][4];
        exceptionHandling(notSquaredEmpty);
        System.out.println();

        System.out.println("*** Case: not squared, only numbers are filled ***");
        String[][] notSquared = {
                {"5", "10", "15", "20"},
                {"5", "10", "15", "20", "25"},
                {"5", "10", "15", "20"},
                {"5", "10", "15", "20"}
        };
        exceptionHandling(notSquared);
        System.out.println();

        System.out.println("*** Case: squared, char is used ***");
        String[][] squaredIncorrect = {
                {"5", "10", "15", "20"},
                {"5", "ten", "15", "20"},
                {"five", "10", "15", "20"},
                {"5", "10", "15", "20"}
        };
        exceptionHandling(squaredIncorrect);
        System.out.println();

        System.out.println("*** Case: squared, only numbers is filled ***");
        String[][] squared = {
                {"5", "10", "15", "20"},
                {"5", "10", "15", "20"},
                {"5", "10", "15", "20"},
                {"5", "10", "15", "20"}
        };
        exceptionHandling(squared);
        System.out.println();
    }

    private static void exceptionHandling(String[][] data) {
        int result = 0;
        try {
            result = ArrayValueCalculator.doCalc(data);
        } catch (ArraySizeException e) {
            System.out.printf("Incorrect size of the array. Should be %dx%d.\n", ArrayValueCalculator.SIZE, ArrayValueCalculator.SIZE);
        } catch (ArrayDataException e) {
            System.out.println("Incorrect value in the array. Only numbers should be used.");
            System.out.println(e);
        } finally {
            System.out.println("Total: " + result);
        }
    }

    private static void doCalculationTest() {
        System.out.println("*** Case: squared, empty ***");
        String[][] squaredEmpty = new String[4][4];
        System.out.println("Total: " + ArrayValueCalculator.doCalculation(squaredEmpty));
        System.out.println();

        System.out.println("*** Case: not squared, empty ***");
        String[][] notSquaredEmpty = new String[5][4];
        System.out.println("Total: " + ArrayValueCalculator.doCalculation(notSquaredEmpty));
        System.out.println();

        System.out.println("*** Case: not squared, only numbers are filled ***");
        String[][] notSquared = {
                {"5", "10", "15", "20"},
                {"5", "10", "15", "20", "25"},
                {"5", "10", "15", "20"},
                {"5", "10", "15", "20"}
        };
        System.out.println("Total: " + ArrayValueCalculator.doCalculation(notSquared));
        System.out.println();

        System.out.println("*** Case: squared, char is used ***");
        String[][] squaredIncorrect = {
                {"5", "10", "15", "20"},
                {"5", "ten", "15", "20"},
                {"five", "10", "15", "20"},
                {"5", "10", "15", "20"}
        };
        System.out.println("Total: " + ArrayValueCalculator.doCalculation(squaredIncorrect));
        System.out.println();

        System.out.println("*** Case: squared, only numbers is filled ***");
        String[][] squared = {
                {"5", "10", "15", "20"},
                {"5", "10", "15", "20"},
                {"5", "10", "15", "20"},
                {"5", "10", "15", "20"}
        };
        System.out.println("Total: " + ArrayValueCalculator.doCalculation(squared));
        System.out.println();
    }
}
