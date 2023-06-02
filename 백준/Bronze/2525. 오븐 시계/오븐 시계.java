/*
처음에는 그대로 시건은 시간으로, 분은 분으로 풀었더니 c의 범위를 생각하지 않아 오답이 남.
이를 고치기 위해 모든 시간을 분으로 변경;
나눗셈 이용해 몫은 새로운 시간으로, 나머지는 새로운 분으로 (여기서 새로운은 요리 이후 나오는 시간) 출력되게 만들었다.
*/

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       
       int hour = scnr.nextInt();
       int min = scnr.nextInt();
       int minCook = scnr.nextInt();
       // -> 모두 분으로 변경
      
       int newHourInMin = hour * 60 + min + minCook;
       
       int newHour = newHourInMin / 60;
       int newMin = newHourInMin % 60;
      
       if (newHour >= 24) {
          newHour -=24;
       }
       System.out.println(newHour + " " + newMin);
   }
}
