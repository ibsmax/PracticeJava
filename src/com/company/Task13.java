package com.company;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task13 {
    public static void main(String[] args) {
        // Задание (Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:)
        // Пункт 1 (Выведите слова, состоящие только из латиницы)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любой текст");
        String text = scanner.nextLine();
        int i = 0, spaceCount = 0;
        int count_latin=0;
        while( i < text.length() ){
            if( text.charAt(i) == ' ' ) {
                spaceCount++;
            }
            i++;
        }
        System.out.println("Введённая строка: "+text);
        System.out.print("Слова состоящие из латиницы: ");
        for (int m = 0; m < spaceCount+1; m++) {
            String[] result = text.split(" ");
            Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
            Matcher matcher = pattern.matcher(result[m]);
            boolean latin = matcher.matches();
            if (latin == true)
            {
                System.out.print(result[m] + " ");
                count_latin=count_latin+1;
            }
        }
        // Пункт 2 (Выведите количество этих слов)
        System.out.println("\n" +"Количество слов из латиницы: "+count_latin);
           }
}
