import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine().trim(); // 양옆 공백제거
       String[] str2 = str.split(" ");
       if (str2[0].equals("") && str2.length == 1) {
           System.out.println(0); //단어가 없는 경우 (처음이나 마지막이 공백이고, 이후 단어 x)
       } else {
           System.out.println(str2.length);
       }
   }
}