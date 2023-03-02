import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int firstNum = num / 1000;
        int secondNum = num / 100;
        secondNum %= 10;
        int thirdNum = num / 10;
        thirdNum %= 10;
        int forthNum = num % 1000;
        forthNum %= 10;
        if (firstNum == forthNum && secondNum == thirdNum) {
            System.out.println(1);
        } else {
            System.out.println(13);
        }
    }
}
