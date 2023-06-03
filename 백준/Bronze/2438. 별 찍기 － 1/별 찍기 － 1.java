import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int n = scnr.nextInt();
      
      for ( int i = 1 ; i <= n ; i++ ){
         for( int j = 1 ; j <= i ; j++ ) {
            System.out.print("*");
         }
         System.out.print('\n');
      }
   }
}