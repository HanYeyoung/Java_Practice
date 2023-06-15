import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       // (1) 숫자를 거꾸로 바꿔서
       int num1 = Integer.parseInt(st.nextToken());
       int num2 = Integer.parseInt(st.nextToken());
      
       // num1의 백의자리와 일의자리 바꾸기
       // 백의자리 --> num1 / 100
       // 십의자리 --> (num / 10) % 10
       // 일의자리 --> num % 10
      
       int newNum1 = (num1 / 100) + ((num1 / 10) % 10) * 10 + (num1 % 10) * 100;
       int newNum2 = (num2 / 100) + ((num2 / 10) % 10) * 10 + (num2 % 10) * 100;
      
       // (2) 둘을 비교, 큰 수 출력
       if (newNum1>newNum2) {
          System.out.println(newNum1);
       }
       else {
          System.out.println(newNum2);
       }
   }
}