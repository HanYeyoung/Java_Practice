import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      for(int i = 1; i <= N; i++) {
         for(int j = i; j < N; j++) {
            System.out.print(" ");
         }
         for(int k = 0; k < i * 2 - 1; k++) {
            System.out.print("*");
         }
         System.out.println();
      }
      for(int i = 2 ; i <= N; i++) {
         for(int j = 1; j < i; j++) {
            System.out.print(" ");
         }
         for(int k = (2 * N) - (i * 2 - 1); k > 0; k--) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}