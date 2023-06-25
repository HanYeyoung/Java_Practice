import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      while (true) {
          int a = scnr.nextInt();
          int b = scnr.nextInt();
      
          if ((a == 0) && (b == 0)) {
              break;
          }
          if (b % a == 0) {
              System.out.println("factor");
          } else if (a % b == 0) {
              System.out.println("multiple");
          } else {
              System.out.println("neither");
          }
      }  
   }
}