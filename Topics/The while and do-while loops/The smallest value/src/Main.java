import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long longNum = scanner.nextLong();
        int base = 1;
        long result;
        int start;

        while (true) {
            result = 1;
            start = 1;
            while (start <= base) {
                result *= start;
                start++;
            }
            if (result > longNum) {
                break;
            }
            base++;
        }
        System.out.println(base);
    }
}
