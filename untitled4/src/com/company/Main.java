package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во суток: ");
        int t  =  scanner.nextInt();
        int chasi = t *24;
        int min = t *1440;
        int sec= t*86400;
        System.out.println("Кол-во суток: "+ t);
        System.out.println(" кол-во часов: "+chasi);
        System.out.println(" кол-во минут: "+min);
        System.out.println(" кол-во секунд: "+sec);
    }
}
