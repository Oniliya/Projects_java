// Задание №0
// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.

// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. 
// Распечатайте содержимое данного множества.

// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.

// package Sem_6.app.src;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class t0_sem6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        HashSet<Integer> numSet = new HashSet<Integer>();
        numSet.add(1);
        numSet.add(2);
        numSet.add(6);
        numSet.add(3);
        numSet.add(2);
        numSet.add(4);
        numSet.add(5);
        numSet.add(3);
        System.out.println(numSet);

        LinkedHashSet<Integer> numSet2 = new LinkedHashSet<Integer>();
        numSet2.add(2);
        numSet2.add(1);
        numSet2.add(3);
        numSet2.add(6);
        numSet2.add(4);
        numSet2.add(5);
        numSet2.add(3);
        numSet2.add(2);
        System.out.println(numSet2);

        TreeSet<Integer> numSet3 = new TreeSet<Integer>();
        numSet3.add(6);
        numSet3.add(1);
        numSet3.add(3);
        numSet3.add(6);
        numSet3.add(4);
        numSet3.add(5);
        numSet3.add(3);
        numSet3.add(2);
        System.out.println(numSet3);

        } 
    
}
