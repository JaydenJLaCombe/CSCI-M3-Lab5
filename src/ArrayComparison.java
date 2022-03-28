/*
 * Lab 5 Working With Arrays
 * Jayden LaCombe and Lance Hoffpauer
 * 3/14/2022
 */

import java.util.*;

public class ArrayComparison {

    public static void main(String[] arg) {

        int higherLimit = 15;
        int lowerLimit = 10;
        int size = 10;

        int[] firstArray = initializeArray (higherLimit, lowerLimit, size);
        int[] secondArray = initializeArray (higherLimit, lowerLimit, size);
        printTwoArrays(firstArray, secondArray);
        compareArrays(firstArray, secondArray, size);

    }

    public static void printTwoArrays(int[] array1, int[] array2) {

        for (int dex = 0; dex < array1.length; dex++) {
            String dex_str1 = String.format("index%3d:  %3d %3d\n", dex, array1[dex], array2[dex]);
            System.out.print(dex_str1);
        }
    }

    public static void compareArrays(int[] array1, int[] array2, int num_elements) {

        int highsArray1 = 0;
        int highsArray2 = 0;
        int ties = 0;
        for (int dex = 0; dex < num_elements; dex++) {
            if (array1[dex] > array2[dex]) {
                highsArray1++;
            } else if (array1[dex] < array2[dex]){
                highsArray2++;
            } else if (array1[dex] == array2[dex]) {
                ties++;
            }
        }

        String arr_str1 = "\n";
        arr_str1 += String.format("array 1 has%3d " + "highs\n", highsArray1);
        arr_str1 += String.format("array 2 has%3d " + "highs\n", highsArray2);
        arr_str1 += String.format("  There are%3d " + "ties", ties);

        System.out.println(arr_str1);

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
