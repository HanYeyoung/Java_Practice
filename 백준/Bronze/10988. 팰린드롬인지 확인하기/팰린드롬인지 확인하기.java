import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      StringBuilder sb = new StringBuilder(str); //java.lang.StringBuilder
      
      if (sb.toString().equals(sb.reverse().toString())) {
         // reverse() : 해당 문자 전체를 뒤집는다
         System.out.println("1");
      } else {
         System.out.println("0");
      }
   }
}