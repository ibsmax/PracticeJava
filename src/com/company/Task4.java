package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
    // Пункт 1 (Ввести три числа с клавиатуры x, y, z)
    Scanner scanner =new Scanner(System.in);
    System.out.println("Введите число x");
    int x = scanner.nextInt();
    System.out.println("Введите число y");
    int y = scanner.nextInt();
    System.out.println("Введите число z");
    int z = scanner.nextInt();

    //Пункт 2 (Найти и вывести в консоль среднее арифметическое этих чисел)
    int sred = (x+y+z)/3;
    System.out.println("Среднее арифметическое = "+ sred);

    //Пункт 3 (Разделить среднее арифметическое на 2 и округлить в меньшую сторону)
    int sred2 =(sred/2);
    System.out.println("sred2 ="+ Math.floor(sred2));

    //Пункт 4 (Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно")
    if (sred2>3)
    {
        System.out.println("Программа выполнена корректно");
    }
}
}
