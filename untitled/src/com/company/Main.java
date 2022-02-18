package com.company;


public class Main {

    public static void main(String[] args) {
        int[] nums = new int[] { 25, 10, 30, 100 };


        System.out.println(yvelichenie(nums));

    }
    static int yvelichenie (int[] a) {
        System.out.println("Увеличение массива на 20% ");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (a[i] + a[i] * 0.20);
            System.out.print(i + " - ");
            System.out.println(a[i]);
        }

        return 0;
    }

}
