package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Task_Itog2 {
    public static void main(String[] args) {
        // Задание (Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.  Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’. Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String str = scanner.nextLine();
        char[] equation = str.toCharArray();
        System.out.println("Введённое уравнение: ");
        for (int i = 0; i < equation.length; i++) {
            System.out.print(equation[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < equation.length; i++) {

            if (equation[0] == 'x' && equation[1] == '+') {
                String aa =  String.valueOf(equation[2]);
                String bb =  String.valueOf(equation[4]);
                int a = Integer.parseInt (aa);
                int b = Integer.parseInt (bb);
                int res = b - a;
                if (i == equation.length-1) {
                    System.out.println("Ответ:");
                    System.out.println("X = " + res);
                }
            }
            if (equation[0] == 'x' && equation[1] == '-') {
                String aa =  String.valueOf(equation[2]);
                String bb =  String.valueOf(equation[4]);
                int a = Integer.parseInt (aa);
                int b = Integer.parseInt (bb);
                int res = a + b;
                if (i == equation.length-1) {
                    System.out.println("Ответ:");
                    System.out.println("X = " + res);
                }
            }
            if (equation[2] == 'x' && equation[1] == '-') {
                String aa = String.valueOf(equation[0]);
                String bb = String.valueOf(equation[4]);
                int a = Integer.parseInt(aa);
                int b = Integer.parseInt(bb);
                int res = -b + a;
                if (i == equation.length - 1) {
                    System.out.println("Ответ:");
                    System.out.println("X = " + res);
                }
            }
            if (equation[2] == 'x' && equation[1] == '+') {
                String aa =  String.valueOf(equation[0]);
                String bb =  String.valueOf(equation[4]);
                int a = Integer.parseInt (aa);
                int b = Integer.parseInt (bb);
                int res = b - a;
                if (i == equation.length-1) {
                    System.out.println("Ответ:");
                    System.out.println("X = " + res);
                }
            }
            if (equation[4] == 'x' && equation[1] == '+') {
                String aa =  String.valueOf(equation[0]);
                String bb =  String.valueOf(equation[2]);
                int a = Integer.parseInt (aa);
                int b = Integer.parseInt (bb);
                int res = a + b;
                if (i == equation.length-1) {
                    System.out.println("Ответ:");
                    System.out.println("X = " + res);
                }
            }
            if (equation[4] == 'x' && equation[1] == '-') {
                String aa =  String.valueOf(equation[0]);
                String bb =  String.valueOf(equation[2]);
                int a = Integer.parseInt (aa);
                int b = Integer.parseInt (bb);
                int res = a - b;
                if (i == equation.length-1) {
                    System.out.println("Ответ:");
                    System.out.println("X = " + res);
                }
            }

        }
    }
}




