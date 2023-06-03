import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = scnr.nextInt();
        }
        
        int v = scnr.nextInt();
        int count = 0;
        
        for (int i = 0 ; i < n ; i++) {
            if (array[i] == v) {
                count++;
            }
        }
        System.out.println(count);
    }
}