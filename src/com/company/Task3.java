package com.company;

public class Task3 {
    public static void main(String[] args) {
        //Пункт 1
        int[] massive = {1, 2, 3, 4, 5};

        //Пункт 2
        int first = massive[4];
        int last = massive[0];
        int[] massive2 = {first,2,3,4,last};

        //Пункт 3
        int a =massive2 [massive2.length -1];
        int b =massive2 [massive2.length -3];
        int sum = a + b;
        System.out.println(sum);
        }
    }

