import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int largerParts = 0;
        int smallerParts = 0;
        int perfectParts = 0;
        int inputNum;

        for (int i = 0; i < amount; i++) {
            inputNum = scanner.nextInt();
            if (inputNum == 1) {
                largerParts++;
            } else if (inputNum == -1) {
                smallerParts++;
            } else if (inputNum == 0) {
                perfectParts++;
            }
        }
        System.out.println(perfectParts + " " + largerParts + " " + smallerParts);

    }
}