package com.company;

public class Main {

    public static void main(String[] args) {
        int i, j;
        int[][] myArray = {{18, 28}, {11, 45}};

        for (i = 0; i < myArray.length; ++i) {
            for (j = 0; j < myArray.length; ++j) System.out.print(myArray[i][j] + " ");
            System.out.println();
        }
        System.out.println("Инвертированная матрица ");
        int[][] myArray1 = {{18, 28}, {11, 45}};
        for (i = 0; i < myArray1.length; ++i) {
            for (j = 0; j < myArray1.length; ++j) {

                System.out.print(myArray1[j][i] + " ");
            }
            System.out.println();
        }




    }
}

