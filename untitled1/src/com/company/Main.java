package com.company;

import java.util.Scanner;

public class Main {
    static double convert(double rubсourse, double rubcount) {
        return rubcount / rubсourse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите курс рубля: ");
        double rubсourse = scanner.nextDouble();
        System.out.print("Сумма рублей: ");
        double rubсount = scanner.nextDouble();
        System.out.println("Сумма долларов: "  + convert(rubсourse, rubсount)+" $" );
    }


    }