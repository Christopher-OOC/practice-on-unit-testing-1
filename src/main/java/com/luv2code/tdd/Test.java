package com.luv2code.tdd;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the order of the matrix: ");
        int order = scanner.nextInt();

        int[][] array1 = new int[order][order];

        System.out.println("Input the values of the array");

        // Array input
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                array1[i][j] = scanner.nextInt();
            }
        }

        // Printing inputted array values
        System.out.println("The array you entered is:");
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                System.out.print(array1[i][j] + "  ");
            }
            System.out.println();
        }

        // To find the max value and its location
        int maxValue = array1[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] > maxValue) {
                    maxValue = array1[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("The max value in the array is: " + maxValue);
        System.out.println("Location: " + "(" + maxRow + ", " + maxCol + ")");
    }
}