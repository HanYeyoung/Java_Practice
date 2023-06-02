import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       
       int x = scnr.nextInt(); // 영수증에 적힌 총 금액 
       int n = scnr.nextInt(); // 영수증에 적힌 구매한 물건의 종류의 수
       int sum = 0;
      
       for (int i = 1; i <= n ; i++) {
           int a = scnr.nextInt(); // 각 물건의 가격 
           int b = scnr.nextInt(); // 각 물건의 개수
           sum += a*b;
       }
       if (sum == x) {
           System.out.println("Yes");
       } else {
           System.out.println("No");
       }
   }
}
