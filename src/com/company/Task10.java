package com.company;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // Пункт 1 (Пользователь вводит данные с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3. Размерность матрицы задается пользователем)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int a = scanner.nextInt();
        System.out.println("Введите разрядность массива");
        int b = scanner.nextInt();
        int [][] matrixArray = new int[a][b];
        for (int i = 0 ; i < matrixArray.length; i++){
            for (int k = 0; k < matrixArray[i].length; k++) {
                System.out.print("Введите элемент массива[" + i + "][" + k + "]:");
                matrixArray[i][k] = scanner.nextInt();
            }
        }

        System.out.print("Элементы первой строки матрицы умноженные на 3 : ");
        for (int i = 0 ; i <1; i++){
            for (int k = 0; k < matrixArray[i].length; k++) {
                System.out.print(matrixArray[i][k]*3 + " ");
            }
        }
        }

    }
