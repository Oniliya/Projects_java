

import java.util.ArrayList;

// public class lect_3 {
public class Ex01_object {    
    public static void main(String[] args) {
        Object o =1;
        GetType(o);
        o= 1.2;
        GetType(o);
        System.out.println(Sum(1,2));
        System.out.println(Sum(1.0,2));
        System.out.println(Sum(1,2.0));
        System.out.println(Sum(1.2,2.1));

        int[] a = new int[] {1, 9};
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length);

        for (int i : a) { System.out.printf("%d", i);} // 1 9

        for (int j : b) { System.out.printf("%d", j);} // 

        // 0 9 0 0 0 0 0 0 0 0

        System.out.println("");

        int[] a1 = new int[] { 0, 9 };
        for (int i : a1) { System.out.printf("%d ", i); }
        System.out.println("");
        a1 = AddItem(a1, 2);
        a1 = AddItem(a1, 3);
        for (int j : a1) { System.out.printf("%d ", j); }
        System.out.println("");

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2809);

        for (Object o1 : list){
            System.out.println(o1);
        }


    }
    static void GetType(Object obj){
        System.out.println(obj.getClass().getName());
    }
    
    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double){
            return(Object)((Double) a + (Double) b);
        } 
        else if (a instanceof Integer && b instanceof Integer){
            return (Object) ((Integer) a + (Integer) b);
        }
        else return 0;
        
    }
    
    static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        
        temp[length] = item;
        return temp;
    }



}
