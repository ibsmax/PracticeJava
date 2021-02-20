package com.company;


public class Task14 {
    public static void main(String[] args) {
        // Задание (Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:)
        // Пункт 1 (Выведите максимальный и минимальный элемент массива)
        int min =-19;
        int max = 19;
        int elements_count= 15;
        double maximum = 0;
        double minimum = 0;
        double myMassive [] = new double[elements_count];
        System.out.print("Элементы массива: ");
        for (int i=0; i< elements_count; i++)
        {
            double per = (double)(Math.random()*((max-min)+1))+min;
            myMassive[i] = per;
            myMassive[i] = (Double)Math.floor(myMassive[i]*100)/100.0;

            if(minimum > myMassive[i]){
                minimum = myMassive[i];
            }
            if (maximum < myMassive[i]){
                maximum = myMassive[i];
            }
            System.out.print( myMassive[i] +" ");

            // Пункт 2 (Из максимального и минимального значения выведите наибольшее по модулю)
            if (i ==14) {
                System.out.print("\n");
                System.out.print( "\n" + "Максимальный элемент массива = " + maximum + "\n"  + "Минимальный элемент массива = " + minimum + "\n" + "\n");
                double modul1 = Math.abs(maximum);
                double modul2 = Math.abs(minimum);
                System.out.print("Модуль максимального элемента = " + modul1 + "\n");
                System.out.print("Модуль минимального элемента = " + modul2 + "\n" + "\n");
                double itog = Math.max(modul1,modul2);
                System.out.print("Наибольшее число по модулю = " + itog);
            }
        }


        }
    }

