import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        boolean doesContain =false;
        for (int i : arr) {
            if (i == num) {
                doesContain = true;
            }
        }
        System.out.println(doesContain);
    }
}