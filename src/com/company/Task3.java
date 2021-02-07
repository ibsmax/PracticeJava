package com.company;

public class Task3 {
    public static void main(String[] args) {
        //Пункт 1 (Задайте массив из 5 любых целых чисел)
        int[] massive = {1, 2, 3, 4, 5};

        //Пункт 2 (Поменяйте местами первый и последний элемент в массиве)
        int tmp = massive[0];
        massive[0] = massive[4];
        massive[4] =tmp;
        System.out.println(massive[0]);
        System.out.println(massive[4]);

        //Пункт 3 (Вывести в консоль результат суммы первого и среднего элемента)
        int a = massive[massive.length -5];
        int b = massive[massive.length -3];
        int sum = a + b;
        System.out.println(sum);
        }
    }

