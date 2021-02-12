package com.company;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        // Напишите программу конвертер физических величин
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int metric = scanner.nextInt();
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;

        switch (metric) {
            case 1:
                System.out.println("Выберите единицу измерения: 1 - кг, 2 - центнер, 3 - тонна");
                Scanner scanner2 = new Scanner(System.in);
                int type = scanner2.nextInt();


                if (type == one)
                { System.out.println("Введите число");
                  Scanner scanner3 = new Scanner(System.in);
                  double value = scanner3.nextDouble();

                  double m1=value;
                  double m2=value/100;
                  double m3=value/1000;
                  System.out.println("Киллограммы: "+ m1);
                  System.out.println("Центнеры: "+ m2);
                  System.out.println("Тонны: "+ m3);
                  break;
                }

                if (type == two)
                {
                    System.out.println("Введите число");
                    Scanner scanner3 = new Scanner(System.in);
                    double value = scanner3.nextDouble();

                    double m1=value*100;
                    double m2=value;
                    double m3=value/10;
                    System.out.println("Киллограммы: "+ m1);
                    System.out.println("Центнеры: "+ m2);
                    System.out.println("Тонны: "+ m3);
                    break;
                }

                if (type == three)
                {
                    System.out.println("Введите число");
                    Scanner scanner3 = new Scanner(System.in);
                    double value = scanner3.nextDouble();

                    double m1=value*1000;
                    double m2=value*10;
                    double m3=value;
                    System.out.println("Киллограммы: "+ m1);
                    System.out.println("Центнеры: "+ m2);
                    System.out.println("Тонны: "+ m3);
                    break;
                }

            case 2:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                Scanner scanner4 = new Scanner(System.in);
                int type2 = scanner4.nextInt();

                System.out.println("Введите число");
                Scanner scanner5 = new Scanner(System.in);
                double value2 = scanner5.nextDouble();

                if (type2 == one)
                {
                    double d1=value2;
                    double d2=value2/1609;
                    double d3=value2/1.094;
                    double d4=value2*3.281;
                    System.out.println("Метры: "+ d1);
                    System.out.println("Мили: "+ d2);
                    System.out.println("Ярды: "+ d3);
                    System.out.println("Футы: "+ d4);
                    break;
                }

                if (type2 == two)
                {
                    double d1=value2*1609;
                    double d2=value2;
                    double d3=value2*1760;
                    double d4=value2*5280;
                    System.out.println("Метры: "+ d1);
                    System.out.println("Мили: "+ d2);
                    System.out.println("Ярды: "+ d3);
                    System.out.println("Футы: "+ d4);
                    break;
                }

                if (type2 == three)
                {
                    double d1=value2/1.094;
                    double d2=value2/1760;
                    double d3=value2;
                    double d4=value2*3;
                    System.out.println("Метры: "+ d1);
                    System.out.println("Мили: "+ d2);
                    System.out.println("Ярды: "+ d3);
                    System.out.println("Футы: "+ d4);
                    break;
                }

                if (type2 == four)
                {
                    double d1=value2/3.281;
                    double d2=value2/5280;
                    double d3=value2/3;
                    double d4=value2;
                    System.out.println("Метры: "+ d1);
                    System.out.println("Мили: "+ d2);
                    System.out.println("Ярды: "+ d3);
                    System.out.println("Футы: "+ d4);
                    break;
                }
        }
        }
    }

