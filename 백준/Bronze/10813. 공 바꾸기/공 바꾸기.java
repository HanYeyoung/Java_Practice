import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");

       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());
       int[] array = new int[N];
      
       for (int i = 0; i < N; i++) {
            array[i] = i + 1;
        }
      
       for (int index = 0 ; index < M ; index++) {
           int temp = 0;
           st = new StringTokenizer(br.readLine(), " ");
          
           int i = Integer.parseInt(st.nextToken());
           int j = Integer.parseInt(st.nextToken());
           
           temp = array[i-1];
           array[i-1] = array[j-1];
           array[j-1] = temp;
       }
       
       br.close();
      
       for (int i = 0 ; i < array.length ; i++) {
           System.out.print(array[i] + " ");
       }
   }
}