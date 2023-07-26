package OriginNumFinder;
// Задание №1
// 1. Напишите метод, который заполнит массив из 1000 элементов случайными
// цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с
// помощью Set вычислите процент уникальных значений в данном массиве и
// верните его в виде числа с плавающей запятой.

// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее
// количество чисел в массиве.

import java.util.HashSet;

import java.util.Random;
import java.util.Set;

public class T1_sem6 {

    public static int[] getRandomArray(int size, int maxValue) {
        int[] myArray = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            myArray[i] =rnd.nextInt(24);
        }
        return myArray;
    }

    public static Set<Integer> arrayToSet(int[] array) {
        Set<Integer> uniques = new HashSet<>();
        for (int num : array) {
            uniques.add(num);
        }
        return uniques;
    }

    public static double proc(int len1, int len2){
        double res = (double)len2*100/(double)len1;
        return res;
    }


}
