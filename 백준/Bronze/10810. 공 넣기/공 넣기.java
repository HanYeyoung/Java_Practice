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
      

       for (int index = 0 ; index < M ; index++) {
           st = new StringTokenizer(br.readLine(), " ");
          
           int i = Integer.parseInt(st.nextToken());
           int j = Integer.parseInt(st.nextToken());
           int k = Integer.parseInt(st.nextToken());
           
          for (int index2 = i-1 ; index2 < j ; index2++) {
              array[index2] = k;
          }
       }
      
       for (int i = 0; i < array.length ; i++) {
           System.out.print(array[i] + " ");
       } 
   }
}