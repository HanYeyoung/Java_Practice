import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      while (true) {
         int n = scnr.nextInt();
         int m = scnr.nextInt();
         
         if (n == 0 && m == 0) {
            break;
         }
         System.out.println(n+m);
      }
   }
}