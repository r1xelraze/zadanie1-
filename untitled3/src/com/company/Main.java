package com.company;

public class Main {

    public static void main(String[] args) {
        int i;
        int j;
        boolean prostoeChislo = true;
        System.out.println("Простые числа");
        for ( i = 2; i < 100; i++ )  {
            prostoeChislo = true;
            for ( j = 2; j <= i / j; j++ ){
                if ((i % j) == 0)
                    prostoeChislo = false;
            }

            if (prostoeChislo)
            System.out.println( i  );
        }
    }
}
