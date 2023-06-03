import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int n = scnr.nextInt();
      int times = n / 4 - 1;
      
      for (int i = 0 ; i <= times ; i++) {
          System.out.print("long ");
      }
       System.out.println("int");
   }
}