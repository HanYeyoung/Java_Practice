import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       
       int T = scnr.nextInt(); // 테스트 케이스 개수
       for (int i = 0; i < T ; i++) {
          int a = scnr.nextInt();
          int b = scnr.nextInt();
          System.out.println(a+b);
      }
   }
}
