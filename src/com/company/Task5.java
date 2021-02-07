package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Пункт 1 (Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x");
        int x = scanner.nextInt();
        System.out.println("Введите число y");
        int y = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите арифметический знак + или - или * или / ");
        String arf = scanner2.nextLine();

        //Пункт 2 В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции)
        String plus ="+";
        String minus ="-";
        String delenie ="/";
        String ymnojenie ="*";

        if (arf.equals(plus)) {
            int res = x + y;
            System.out.println("Результат = "+ res);
        }
        if (arf.equals(minus)) {
            int res = x - y;
            System.out.println("Результат = "+ res);
        }
        if (arf.equals(delenie)) {
            int res = x / y;
            System.out.println("Результат = "+ res);
        }
        if (arf.equals(ymnojenie)) {
            int res = x * y;
            System.out.println("Результат = "+ res);
        }
    }
}