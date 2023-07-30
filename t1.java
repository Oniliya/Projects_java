import java.util.Arrays;

class Answer {
    public int[] subArrays(int[] a, int[] b){
      // Введите свое решение ниже
      if (a.length==b.length) {
        int[] result = new int[a.length];
        for (int i = 0; i < result.length; i++) {
          try {
            result[i]=a[i]/b[i];  
          } catch (Exception e) {
            throw new RuntimeException("RuntimeException"); 
          }  
          
        }
        return result;
      }
      else {
        return new int[]{0};
      }
       
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class t1{ 
    public static void main(String[] args) { 
      int[] a = {};
      int[] b = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        a = new int[]{12, 8, 16};
        b = new int[]{4, 2, 0};
      }
      else{
        a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
      }     
      
      Answer ans = new Answer(); 
      String itresume_res = Arrays.toString(ans.subArrays(a, b));     
      System.out.println(itresume_res);
    }
}