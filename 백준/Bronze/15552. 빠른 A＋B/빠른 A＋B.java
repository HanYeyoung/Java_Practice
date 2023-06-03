// 학교 수업에서는 BufferedReader + BufferedWriter를 아직까지 이용을 안 해보았으므로,
// 주석과 함께 천천히 공부하며 풀어보자

/* 일반적으로 입력+출력하는 방법에는 여러가지가 있는데, 
(1) Scanner + System.out.println
(2) BufferedReader + BufferedWriter
(3) BufferedReader + StringBuilder
이용하는 방법이 있으며,
또한 문자열 분리해 입력하기 위해
(1) StringTokenizer
(2) subString 
이용하는 방법이 있다.

위 문제에서는 BufferedReader와 BufferedWriter를 사용할 수 있다고 명시 되어있으므로,
이를 이용해 풀어보자. (+ StringTokenizer)
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader에서 예외처리 하지 않을 시 오류 발생 위험이 있다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        // 기본 스트링으로 입력 받았기 때문에, 정수형으로 형변환 해주기
        
        StringTokenizer st; // 문자열(스트링)으로 입력 받았기 때문에, 분리하기 위해서 이용
        // 하나의 문자열을 여러 토큰으로 분리
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            // 문자열을 공백 기준으로 나누기
            // 두 토큰을 더한 값을 넣어주기 + 줄 바꿈까지!
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        br.close(); 
        bw.flush(); // 비우고
        bw.close(); // Close.
    }
}