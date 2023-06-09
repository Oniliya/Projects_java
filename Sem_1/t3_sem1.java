// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.

package Sem_1;

public class t3_sem1 {
   public static void main(String[] args) throws Exception {
        task3();
    
    }

private static void task3() {
    int[] nums = {1,1,3,2,1,3,1}; 
    int val = 3;
    int[] nums2 = new int[nums.length];

    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i]==val) {count++;}
    }
    int j=0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i]!=val) {
            // nums2[j]=nums[i];
            // j++;
            nums2[j++]=nums[i];
        }
    }
    for (int k = nums.length-count; k < nums2.length; k++) {
        nums2[k]=val;
    }
    for (int item : nums2) {
        System.out.print(item);
        
    }
    }

}   

