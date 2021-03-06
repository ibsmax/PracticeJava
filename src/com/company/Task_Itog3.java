package com.company;
import java.util.*;
import java.util.Scanner;

public class Task_Itog3 {
    public static void main(String[] args) {
        // Задание (Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки. Среди данных строк найти строку с максимальным количеством различных символов. Если таких строк будет много, то вывести первую)

        int maximum = 0;
        int sovpadenie=0;
        String str_max = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк ");
        int length_mass = scanner.nextInt();
        String[] myMassive = new String[length_mass + 1];
        System.out.println("Введите строки : ");

        for (int i = 0; i < length_mass + 1; i++) {
            myMassive[i] = scanner.nextLine();
        }
        System.out.println("Введённые строки :");

        for (int i = 1; i < length_mass + 1; i++) {
            int length_string = myMassive[i].length();
            System.out.println(myMassive[i]);
            char[] strToArray = myMassive[i].toCharArray();
            char[] strToArray2 = strToArray;
            HashSet<String> h = new HashSet<String>();
            for (int m = 0; m < strToArray.length; m++) {

                for (int k = 0; k < strToArray2.length; k++) {
                    if (strToArray[m] == strToArray[k]) {
                       sovpadenie++;
                }
            }
                if (sovpadenie == 1 && strToArray[m] != ' ')
                {
                    String str = String.valueOf(strToArray[m]);
                    h.add(str);
                }
                sovpadenie=0;
            }
            if (maximum < h.size()) {
                maximum = h.size();
                str_max = myMassive[i];

            }
            if (i == length_mass) {
                System.out.print("\n");
                System.out.println("Строка с макс.количеством уникальных символов = " + str_max);
            }
        }
    }
}









