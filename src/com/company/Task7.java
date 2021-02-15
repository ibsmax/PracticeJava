package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // Пункт 1 (Пользователь вводит размер массива и данные с клавиатуры в массив)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int length_mass = scanner.nextInt();
        String[] myMassive = new String[length_mass+1];
        System.out.println("Введите элементы массива:");
        System.out.println("Длинна массива ="+ length_mass);
        for (int i = 0; i < length_mass+1; i++) {
            myMassive[i] = scanner.nextLine();
        }
        System.out.print("Элементы массива:");
        for (int i = 0; i < length_mass+1; i++) {
            System.out.print(" " + myMassive[i]);
        }
        System.out.println();

        // Пункт 2 (Сравнить элементы массива с заранее заданными константами x, y, z)
        // Пункт 3 (Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах")
        final String x = "1";
        final String y = "2";
        final String z = "3";

        for (int i = 0; i < length_mass+1; i++) {
            if(myMassive[i].equals(x))
            {
                System.out.println("Данное значение имеется в константах x = " + x );
            }
            if(myMassive[i].equals(y))
            {
                System.out.println("Данное значение имеется в константах y = " + y );
            }
            if(myMassive[i].equals(z))
            {
                System.out.println("Данное значение имеется в константах z = " + z );
            }
        }
    }
}