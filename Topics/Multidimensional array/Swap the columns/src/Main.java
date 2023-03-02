import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] inputArr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                inputArr[i][j] = scanner.nextInt();
            }
        }
        int[] tempColumn = new int[rows];
        int col1 = scanner.nextInt();
        int col2 = scanner.nextInt();
        int count = 0;

        while (true) {
            if (count >= rows) {
                break;
            }
            tempColumn[count] =  inputArr[count][col1];
            inputArr[count][col1] = inputArr[count][col2];
            inputArr[count][col2] = tempColumn[count];
            count++;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(inputArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
