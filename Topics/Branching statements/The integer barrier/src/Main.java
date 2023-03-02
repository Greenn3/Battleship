import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum;
        int sum = 0;
        while (scanner.hasNextInt()) {
            inputNum = scanner.nextInt();
            sum += inputNum;
            if (inputNum == 0) {
                System.out.println(sum);
                break;
            }
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }

        }
    }
}