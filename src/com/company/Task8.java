package com.company;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        // Пункт 1 (Напишите программу, где пользователь вводит любое целое положительное число n. А программа суммирует все нечетные числа от 1 до введенного пользователем числа n)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int length = scanner.nextInt();
        int sum = 0;
        int all_sum =0;
        for (int i = 0; i < length; i++) {
            sum = sum+1;
            System.out.println("Элемент массива " + sum + " ");
            if(sum%2 ==1)
            {
                all_sum = sum + all_sum;
            }
        }
        System.out.println("Сумма нечётных чисел = " + all_sum);
    }
}