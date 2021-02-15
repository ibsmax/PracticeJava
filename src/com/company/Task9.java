package com.company;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        //Пункт 1 (Пользователь вводит размер массива и данные с клавиатуры в массив типа double)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int length_mass = scanner.nextInt();
        double sum=0;
        double pred = 0;
        double myMassive[] = new double[length_mass];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < length_mass; i++) {
            myMassive[i] = scanner.nextDouble();
        }
        System.out.print("Элементы массива:");
        //Пункт 2 (Посчитайте среднее арифметическое элементов массива)
        for (int i = 0; i < length_mass; i++) {
            System.out.print(" " + myMassive[i]+ " ");
            pred = sum;
            sum = myMassive[i]+pred;
        }
        double sred = sum/length_mass;
        System.out.println("\n" + "Среднеее арифметическое массива = " + sred);
        //Пункт 3 (После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое)
        for (int i = 0; i < length_mass; i++) {
            System.out.print("Элемент массива после умножения на сред.арифметическое: " + myMassive[i]*sred+ "\n" );
        }
    }
}
