import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        
        boolean isPossible = false;
        for (int i = 1; i <= n; i++) {
            if (k == i * m) {
                isPossible = true;
                break;
            }
        }
        for (int i = 1; i <= m; i++) {
            if (k == i * n) {
                isPossible = true;
                break;
            }
        }
        if (isPossible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
