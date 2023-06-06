import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        // 공백을 기준으로 나누기
       
        int[] array = new int[n];
        
        for (int i = 0 ; i < n ; i++) {
           array[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = array[0];
        int min = array[0];
        
        for (int i = 0 ; i < n ; i++) {
          
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min + " " + max);

    }
}