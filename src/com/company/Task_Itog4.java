package com.company;

import java.util.Scanner;

public class Task_Itog4 {
    public static void main(String[] args) {
        // Задание (Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”. Ответ: “Заархивированный вирус”)
        System.out.println("Напишите ответ на загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает?");
        Scanner scanner = new Scanner(System.in);
        String otvet = scanner.nextLine();
        String reshenie = "Заархивированный вирус";
        boolean res2 = otvet.equals("Подсказка");
        boolean res = otvet.equals(reshenie);
        int counter = 0;

        while (counter < 3) {
            if (res == true) {
                System.out.println("Правильно!");
                counter = 3;
            }
            if (res == false && counter == 2) {
                System.out.println("Обидно, приходи в другой раз");
                counter = 3;
            }
            if (res == false && res2 == false && counter < 3) {

                System.out.println("Подумай еще!");
                counter++;
                String otvet2 = scanner.nextLine();
                res = otvet2.equals(reshenie);
            }
            if (otvet.equals("Подсказка") && counter > 0 && counter<3) {
                System.out.println("Подсказка уже недоступна");
                String otvet3 = scanner.nextLine();
                res = otvet3.equals(reshenie);

            }
            if (otvet.equals("Подсказка") && counter == 0) {
                System.out.println("Ответ связан с кибербезопасностью!");
                String otvet4 = scanner.nextLine();
                res = otvet4.equals(reshenie);

                if (res == true) {
                    System.out.println("Правильно!");
                    counter = 3;
                }

                if (res == false) {
                    System.out.println("Обидно, приходи в другой раз");
                    counter = 3;
                }
            }
        }
    }
}
