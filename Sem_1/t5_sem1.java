// Во фразе "Добро пожаловать на курс по Java" переставить слова
// в обратном порядке.

package Sem_1;

import org.w3c.dom.Text;

public class t5_sem1 {
    public static void main(String[] args) throws Exception {
        // System.out.println("dhgdlkgh");

        task5();
        

    }

    private static void task5() {
        String str="Добро пожаловать на курс по Java";
        String[] words = str.split(" ");

        for (int i = words.length-1; i >= 0; i--) {
            System.out.println(words[i]);
        }

    }

}
