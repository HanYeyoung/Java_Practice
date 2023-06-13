import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
       int T = Integer.parseInt(br.readLine());
      
       for (int i = 0; i < T ; i++) {
          String[] str = br.readLine().split(" ");
          //StringTokenizer 대신 split 이용
		    int R = Integer.parseInt(str[0]);
		    String str2 = str[1];
          
          for (int j = 0 ; j < str2.length() ; j++) {
             for (int k = 0 ; k < R ; k++) {
                 System.out.print(str2.charAt(j));
             }
          }
          System.out.println();
       }
   }
}