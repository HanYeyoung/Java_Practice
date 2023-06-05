import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
       
        int n = scnr.nextInt();
        int x = scnr.nextInt();
       
        int[] array = new int[n];
        
        for (int i = 0 ; i < n ; i++) {
            array[i] = scnr.nextInt();
            if (array[i] < x) {
               System.out.print(array[i] + " ");
            }
        }
    }
}