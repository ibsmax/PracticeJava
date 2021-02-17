package com.company;

public class Task12 {
    public static void main(String[] args) {
        // Задание (Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:)
        // Пункт 1 (Проверить, содержит ли строка подстроку “Java” (используйте contains()))
        String str1 = "I like Java!!!";
        boolean got = str1.contains("Java");
        if (got == true) {
            System.out.println("Строка содержит текст: 'Java'");
        }
        if (got == false) {
            System.out.println("Строка не содержит текст: 'Java' !");
        }

        // Пункт 2 (Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()))
        boolean got2 = str1.startsWith("I like");
        if (got2 == true) {
            System.out.println("Строка начинается с текста: 'I like'");
        }
        if (got2 == false) {
            System.out.println("Строка не начинается с текста: 'I like' !");
        }

        //Пункт 3 (Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()))
        boolean got3 = str1.endsWith("!!!");
        if (got3 == true) {
            System.out.println("Строка заканчивается текстом: '!!!'");
        }
        if (got3 == false) {
            System.out.println("Строка не заканчивается текстом: '!!!'");
        }

        //Пункт 4 (Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру)
        if (got == true && got2 == true && got3 == true)  {
            String str2 = str1.toUpperCase();
            System.out.println(str2);
        }

        //Пункт 5 (Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()))
        String stroka = str1.replace('a', 'o');
        System.out.println(stroka.substring(7,11));
    }
}
