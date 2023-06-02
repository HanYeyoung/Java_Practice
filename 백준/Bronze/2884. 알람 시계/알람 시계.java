import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       
       int hour = scnr.nextInt();
       int min = scnr.nextInt();
       
       if (min == 45) {
           min = 0;
       } else if (min > 45) {
           min -= 45;
       } else {
           hour -= 1;
           min += 15;
       }
      
      if (hour < 0) {
         hour += 24;
      }
       System.out.println(hour + " " + min);
   }
}