import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       
       int a = scnr.nextInt();
       
       for (int i = 1 ; i <= 9 ; i++) {
           System.out.println(a + " * " + i + " = " + (a*i));
       }
   }
}