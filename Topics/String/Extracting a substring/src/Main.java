import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String s = scanner.next();
        int start = scanner.nextInt();
        int stop = scanner.nextInt();
        System.out.println(s.substring(start, stop + 1));
    }
}