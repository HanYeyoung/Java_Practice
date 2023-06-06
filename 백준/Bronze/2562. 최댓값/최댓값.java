import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] array = new int[9];
        int max = array[0];
        int index = 0;
        
        for (int i = 0 ; i < 9 ; i++) {
            array[i] = scnr.nextInt();
            if (array[i] > max) {
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}