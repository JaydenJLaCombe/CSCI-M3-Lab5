/*
 * Lab 5 Working With Arrays
 * Jayden LaCombe and Lance Hoffpauer
 * 3/14/2022
 */

import java.util.Random;

public class ArrayComparison {

    public static void main(String[] arg) {

        int higherLimit = 10;
        int lowerLimit = -10;
        int size = 15;

        int[] firstArray = initializeArray(higherLimit, lowerLimit, size);
        printArray(firstArray);
    }

    public static void printArray(int[] array) {
        for (int dex = 0; dex < array.length; dex++) {
            String dex_str1 = String.format("index %2d:  %3d", dex, array[dex]);
            String dex_str2 = String.format("%3d", array[dex]);
            System.out.print(dex_str1+ " " +dex_str2 + "" + "\n");
        }
    }

    public static int[] initializeArray(int upperLimit, int lowerLimit, int num_elements) {
        int[] arrayOfInts = new int[num_elements];
        Random randGen = new Random();
        int numberValues = upperLimit - lowerLimit + 1;
        for (int dex = 0; dex < num_elements; dex++) {
            arrayOfInts[dex] = randGen.nextInt(numberValues) + lowerLimit;
        }
        return arrayOfInts;
    }


}
