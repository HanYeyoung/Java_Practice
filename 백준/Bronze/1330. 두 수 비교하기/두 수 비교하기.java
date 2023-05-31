import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        int A = scnr.nextInt();
        int B = scnr.nextInt();
        
        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}