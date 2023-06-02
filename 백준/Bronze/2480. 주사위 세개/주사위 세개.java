import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       
       int a = scnr.nextInt();
       int b = scnr.nextInt();
       int c = scnr.nextInt();
      int prize = 0;
       
      if (a == b && b == c && a == c) {
         prize = 10000 + a * 1000;
      } else if ( a == b && a != c ) {
         prize = 1000 + 100 * a;
      } else if ( a == c && a != b ) {
         prize = 1000 + 100 * a;
      } else if ( b == c && a != c ) {
         prize = 1000 + 100 * b;
      } else {
         if (a > b && a > c) {
            prize = a * 100;
        } else if (b > a && b > c) {
            prize = b * 100;
        } else {
           prize = c * 100;
        }
      }
      System.out.println(prize);
      
   }
}