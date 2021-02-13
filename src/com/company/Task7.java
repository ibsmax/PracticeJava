package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // Пункт 1 (Пользователь вводит размер массива и данные с клавиатуры в массив)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int length_mass = scanner.nextInt();
        int myMassive[] = new int[length_mass];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < length_mass; i++) {
            myMassive[i] = scanner.nextInt();
        }
        System.out.print("Элементы массива:");
        for (int i = 0; i < length_mass; i++) {
            System.out.print(" " + myMassive[i]);
        }
        System.out.println();

        // Пункт 2 (Сравнить элементы массива с заранее заданными константами x, y, z)
        // Пункт 3 (Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах")
        final int x = 1;
        final int y = 2;
        final int z = 3;

        for (int i = 0; i < myMassive.length; i++) {
            if(myMassive[i]==x)
            {
                System.out.println("Данное значение имеется в константах x = " + x );
            }
            if(myMassive[i]==y)
            {
                System.out.println("Данное значение имеется в константах y = " + y );
            }
            if(myMassive[i]==z)
            {
                System.out.println("Данное значение имеется в константах z = " + z );
            }
            }
        }
    }

