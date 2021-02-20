package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_Itog1 {
    public static void main(String[] args) {
        // Задание (Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу. Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество рублей: ");
        double count_money = scanner.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара:");
        double kurs= scanner2.nextDouble();
        double itog = count_money/kurs;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Итого получите долларов = " + df.format(itog));
    }
}
