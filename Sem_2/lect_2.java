package Sem_2;

import java.io.File;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.plaf.synth.SynthRootPaneUI;

public class lect_2 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<100; i++){
            sb.append("+");
        }

        // int n= input_num();
        // System.out.println(sum_num(n));
        System.out.println(sb);
        String[] name ={"с","е","р","г","е","й"};
        String sk = "Сегей ка.";
        System.out.println(sk.toUpperCase());
        System.out.println(String.join("", name));

        System.out.println(String.join(",", "r", "t", "y", "q", "w"));
        System.out.println(String.join(",", sk, "t", "y", "q", "w"));
        
        System.out.println("\n");

        String pathProject1 = System.getProperty("user.dir");
        String pathFile1 = pathProject1.concat("/file.txt");
        File f2 = new File(pathFile1);
        System.out.println(f2.getAbsolutePath());

        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            String pathDir = pathProject.concat("/files");
            
            File file = new File(pathFile);
            File dir = new File(pathDir);
            System.out.println(file.getAbsolutePath());
            System.out.println(dir.getAbsolutePath());

            if (file.createNewFile()){
                System.out.println("file created");
            }
            else {
                System.out.println("file existed");
            }

            if (dir.mkdir()){
                System.out.println("+");
            }
            else {
                System.out.println("-");
            }
            for (String fname : dir.list()){
                System.out.println(fname);
            }
            // System.out.println("try");

        } catch (Exception e) {
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }

    }
}
