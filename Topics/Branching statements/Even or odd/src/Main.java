import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum;
        while (scanner.hasNextInt()) {
            inputNum = scanner.nextInt();
            if (inputNum == 0) {
                break;
            } else if (inputNum % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}