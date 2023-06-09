// Напишите метод, который находит самую длинную строку общего
// префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".

package Sem_1;

import org.w3c.dom.Text;

public class t4_sem1 {
    public static void main(String[] args) throws Exception {
        // System.out.println("dhgdlkgh");

        String[] lines={"Дом", "Домовой", "Домашний"};

        int kol = findPrx(lines);
        System.out.println(kol);
        

    }

    private static int findPrx(String[] lines) {
        int res=0;
        boolean prfExist=true;
        while(prfExist){
            res++;
            for (int i = 0; i < lines.length-1; i++) {
                if (lines[i].substring(0,res).compareTo(lines[i+1].substring(0, res))!=0){
                    res--;
                    prfExist=false;
                    break;
                }
            }
        }
        return res;
    }

}