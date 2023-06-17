import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      int king = Integer.parseInt(st.nextToken());
      int queen = Integer.parseInt(st.nextToken());
      int rook = Integer.parseInt(st.nextToken());
      int bishop = Integer.parseInt(st.nextToken());
      int night = Integer.parseInt(st.nextToken());
      int pawn = Integer.parseInt(st.nextToken());
      
      king = 1 - king;
      queen = 1 - queen;
      rook = 2 - rook;
      bishop = 2 - bishop;
      night = 2 - night;
      pawn = 8 - pawn;
      
      System.out.println(king + " " + queen + " " + rook + " " + bishop + " " + night + " " + pawn);
      
   }
}