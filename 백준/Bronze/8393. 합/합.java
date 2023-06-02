import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       
       int n = scnr.nextInt();
       int sum = 0;
       for (int i = 1; i <= n ; i++) {
           sum += i;
       }
       System.out.println(sum);
   }
}
