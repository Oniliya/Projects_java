import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println(getFileSize(new File( "S:\\Projects_java\\Exception\\Lection1\\123")));

        System.out.println(divide(10, 0));

        a();

    }


    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }

    public static int divide(int a1, int a2)  {
        // if (a2==0) {return -1;}
        if (a2==0) {
            // return -1;
            throw new RuntimeException("Divide by zero nor petmited");
        }
        return a1/a2;

    }

    public static void a() {
        b();
    }
    public static void b() {
        c();
    }
    public static void c() {
        int[] ints = new int[10];
        System.out.println(ints[1000]);       
    }

}
