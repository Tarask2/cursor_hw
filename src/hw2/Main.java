package hw2;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //Task 1

        System.out.println("Task 1");
        Integer[] array2 = {2, 3, 1, -7, 11};
        Arrays.sort(array2, Collections.reverseOrder());
        System.out.println("Sorting array in descending order: " + Arrays.toString(array2));


        //Task 2
        System.out.println("Task 2");

        int positive = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > 0) {
                positive += array2[i];
            }

        }
        System.out.println("Sum positive value: " + positive);


        //Task3
        System.out.println("Task 3");

        int avg = 0;
        int sum = 0;
        int[] array1 = {7, 4, 7, 9, 12};
        for (int i : array1) {
            sum += i;
            avg = sum / array1.length;
        }
        System.out.println("Average of values: " + avg + "\n");


        //Task4
        System.out.println("Task 4");

        int[] array = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    continue;
                } else if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
        System.out.println("Replace all duplicate values: " + Arrays.toString(array));

    }

}



