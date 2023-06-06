import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] array = new int[10];
        int count = 0;
       
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(br.readLine()) % 42;
        }
       
        for (int i = 0; i < 10; i++) {
            int temp = 0;
            for (int j = i+1; j < 10; j++) {
                if (array[i] == array[j]) {
                    temp++;
                }
            }
            if (temp == 0) {
                count++;
            }
        }
       
        System.out.println(count);
    }
}