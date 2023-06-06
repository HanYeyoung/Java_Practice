import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int[] array = new int[9];
        int max = array[0];
        int index = 0;
        
        for (int i = 0 ; i < 9 ; i++) {
           array[i] = Integer.parseInt(br.readLine());
           if (array[i] > max) {
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}