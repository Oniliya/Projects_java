public class App {
    // public static void main(String[] args) throws Exception {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int num[] = new int[4];
        try {
            System.out.println("block try");
            int num1 = Integer.parseInt("2341saa"); // at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            int number = num[111];  
            System.out.println("эта строка не отобразится "+number);    
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("in catch 1 "+e.getMessage());
        } 
        catch (NumberFormatException e) {
            System.out.println("in catch 2 "+e.getMessage());
        }
        finally {
            System.out.println("block finally");
        }

        System.out.println("continue .... ");
        

    }
}
