import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      String str = "";
      
      for (int i = 0 ; i < t ; i++) {
         str = br.readLine();
         System.out.println(str.charAt(0) + str.substring(str.length()-1));
      }
      
      br.close();
   }
}