import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      String num = br.readLine();
      int sum = 0;
      
      for (int i = 0 ; i < n ; i++) {
         sum += num.charAt(i) - '0';
         //아스키코드로 변환되어 출력되는거 방지 위해 -'0' 해주기
      }
      
      br.close();
      System.out.println(sum);
   }
}