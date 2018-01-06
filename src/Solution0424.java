package com.javarush.task.task04.task0424;
/*
Три числа
Ввод с клавиатуры, сравнение чисел и вывод на экран - у студентов 4 уровня секретного центра JavaRush эти навыки
оттачиваются до автоматизма.
Давайте напишем программу, в которой пользователь вводит три числа с клавиатуры. Затем происходит сравнение,
и если мы находим число, которое отличается от двух других, выводим на экран его порядковый номер.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна использовать команды System.out.println() или System.out.print().
3. Программа должна выводить на экран порядковый номер числа, отличного от остальных.
4. Если все числа разные, ничего не выводить.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int[] vect = new int[3];
        int[] vect2 = new int[3];


        for (int i=0;i<3;i++) {
            vect[i] = sc.nextInt();
        }

        int k = 0;
        int k1 = 0;
        int res = 0;
        for (int i=0;i<3;i++) {
            k = 0;
            for (int j = 0; j < 3; j++)
                if (vect[i] != vect[j]) {
                    k += 1;
                }
            if (k == 2) {
                res = i;
                k1 += 1;

            }
        }
        if (k1 == 1)
            System.out.println(res+1);
    }
}
