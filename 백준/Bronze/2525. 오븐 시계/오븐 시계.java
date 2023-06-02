import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       
       int hour = scnr.nextInt();
       int min = scnr.nextInt();
       int minCook = scnr.nextInt();
       // c의 범위에 유의할 것. -> 모두 분으로 변경
      
       int newHourInMin = hour * 60 + min + minCook;
       
       int newHour = newHourInMin / 60;
       int newMin = newHourInMin % 60;
      
       if (newHour >= 24) {
          newHour -=24;
       }
       System.out.println(newHour + " " + newMin);
   }
}
