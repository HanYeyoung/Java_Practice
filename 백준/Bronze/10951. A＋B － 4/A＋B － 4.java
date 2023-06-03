import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      while (scnr.hasNext()) {
         
         int n = scnr.nextInt();
         int m = scnr.nextInt();
         
         System.out.println(n+m);
      }
   }
}