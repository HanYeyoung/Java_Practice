import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        
        System.out.println(a * (b % 10));
        System.out.println(a * ((b / 10) % 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
    }
}