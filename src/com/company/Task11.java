package com.company;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        // Пункт 1 (Ввести первое число с клавиатуры и записать его в строковую переменную)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double per1 = scanner.nextDouble();
        String after1 =  String.valueOf(per1);

        // Пункт 2 (Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int)
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе число");
        double per2 = scanner2.nextDouble();
        int after2 = (int) per2;

        // Пункт 3 (Сравнить 2 числа и вывести большее на экран)
        double result = Math.max(per1,per2);
        System.out.println("Сравниваемые числа: "+ per1 + " и " + per2);

        // Пункт 4 (Выведите также меньшее число на экран, предварительно переконвертировать его в тип double)
        double after3 = Double.valueOf(after1);
        int after4 = (int) after3;
        int result2 = Math.min(after2,after4);
        double result3 = (double) result2;
        if (per1 == per2)
        {
            System.out.print("Числа равны! ");
        }
        else {
            System.out.println("Большее число = " + result);
            System.out.println("Меньшее число = " + result3);
        }
    }
}
