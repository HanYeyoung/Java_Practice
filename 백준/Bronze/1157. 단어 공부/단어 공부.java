import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int[] count = new int[26]; //알파벳 26개
        
        String str = br.readLine();
        str = str.toUpperCase(); // 대문자로 통일
        
        int max = -1;
        char result = '?'; // 출력할 값
        
        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i) - 'A']++;
           
            if(count[str.charAt(i) - 'A'] > max){
                max = count[str.charAt(i) - 'A'];
                result = str.charAt(i);
            } else if (max == count[str.charAt(i) - 'A']){
                result = '?';
            }
        }
        System.out.println(result);
    }
}