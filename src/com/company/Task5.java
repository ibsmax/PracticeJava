package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Пункт 1 (Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x");
        float x = scanner.nextFloat();
        System.out.println("Введите число y");
        float y = scanner.nextFloat();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите арифметический знак + или - или * или / ");
        String arf = scanner2.nextLine();

        //Пункт 2 (В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции)
        switch (arf) {
            case "+":
                float res = x + y;
                System.out.println("Результат = " + res);
                break;

            case "-":
                float res2 = x - y;
                System.out.println("Результат = " + res2);
                break;

            case "/":
                float res3 = x / y;
                System.out.println("Результат = " + res3);
                break;

            case "*":
                float res4 = x * y;
                System.out.println("Результат = " + res4);
                break;
        }
    }
}