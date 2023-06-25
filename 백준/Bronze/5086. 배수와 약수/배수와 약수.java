import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException  {
        String factor = "factor\n";
        String multiple = "multiple\n";
        String neither = "neither\n";
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if (a == 0 && b == 0) {
                break;
            }
            if (b % a == 0) {
                sb.append(factor);
            } else if (a % b == 0) {
                sb.append(multiple);
            } else {
                sb.append(neither);
            }
        }
        System.out.print(sb);
    }
}