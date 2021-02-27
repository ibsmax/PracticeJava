package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Task_Itog2 {
    public static void main(String[] args) {
        // Задание (Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.  Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’. Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке)
        Scanner scanner = new Scanner(System.in);
        int length_mass = 5;
        String x = "x";
        String plus = "+";
        String minus = "-";
        String[] equation = new String[length_mass];
        for (int i = 0; i < length_mass; i++) {
            if (i == 0 || i == 2 || i == 4) {
                System.out.println("Введите цифры от 0 до 9 или х ");
            }
            if (i == 1) {
                System.out.println("Введите символ '+' или '-' ");
            }
            if (i == 3) {
                System.out.println("Введите символ '=' ");
            }
            equation[i] = scanner.next();
        }
        System.out.println("Введённое уравнение: ");

        for (int k = 0; k < length_mass; k++) {
            System.out.print(equation[k]+" " );
        }
        System.out.print("\n");

        if ( equation[0].equals(x) && equation[1].equals(plus)) {
            int a = Integer.parseInt(equation[2]);
            int b = Integer.parseInt(equation[4]);
            int res = b - a;
            System.out.println("Ответ:");
            System.out.println("X = " + res);
        }
        if ( equation[0].equals(x) && equation[1].equals(minus)) {
            int a = Integer.parseInt(equation[2]);
            int b = Integer.parseInt(equation[4]);
            int res = a + b;
            System.out.println("Ответ:");
            System.out.println("X = " + res);
        }
        if ( equation[2].equals(x) && equation[1].equals(minus)) {
            int a = Integer.parseInt(equation[0]);
            int b = Integer.parseInt(equation[4]);
            int res =  -b + a;
            System.out.println("Ответ:");
            System.out.println("X = " + res);
        }
        if ( equation[2].equals(x) && equation[1].equals(plus)) {
            int a = Integer.parseInt(equation[0]);
            int b = Integer.parseInt(equation[4]);
            int res =  b - a;
            System.out.println("Ответ:");
            System.out.println("X = " + res);
        }
        if ( equation[4].equals(x) && equation[1].equals(plus)) {
            int a = Integer.parseInt(equation[0]);
            int b = Integer.parseInt(equation[2]);
            int res =  a + b;
            System.out.println("Ответ:");
            System.out.println("X = " + res);
        }
        if ( equation[4].equals(x) && equation[1].equals(minus)) {
            int a = Integer.parseInt(equation[0]);
            int b = Integer.parseInt(equation[2]);
            int res =  a - b;
            System.out.println("Ответ:");
            System.out.println("X = " + res);
        }
    }
}





