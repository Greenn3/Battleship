

class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        // write your code here
        int size = twoDimArray.length;
        int[][] corners = new int[2][2];
        corners[0][0] = twoDimArray[0][0];
        corners[0][1] = twoDimArray[0][twoDimArray[0].length - 1];
        corners[1][0] = twoDimArray[twoDimArray.length - 1][0];
        corners[1][1] =
                twoDimArray[twoDimArray.length - 1][twoDimArray[twoDimArray.length - 1].length - 1];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(corners[i][j] + " ");
            }
            System.out.print("\n");
        }


    }
}
