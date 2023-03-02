import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        // IntelliJ suggested this to replace the while if + else if + else
        // and I think it's great
        return Integer.compare(number, 0);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}
