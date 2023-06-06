import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
       int n = Integer.parseInt(br.readLine()); // 시험 본 과목의 개수
       float[] score = new float[n]; // 현재 시험 성적
       
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      
       // (1) get the current score
      
       for (int i = 0 ; i < n ; i++) {
           score[i] = Integer.parseInt(st.nextToken());
       }
       
       // (2) get the maximum (highest) score
      
       float m = score[0]; // 자기 점수 중에 최댓값
       
       for (float num: score) {
          if (num > m) {
             m = num; 
          }
       }
       
       // (3) change the score
      
       float sum = 0; 
      
       for (int i = 0 ; i < n ; i++) {
           score[i] = (score[i] / m) * 100; 
                    
           sum += score[i];
       }
       
       System.out.println(sum/n);
   }
}