import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String input = reader.readLine();
        char[] charArr = input.toCharArray();
        for(int i = charArr.length-1; i>=0; i--){
            System.out.print(charArr[i]);
        }

        reader.close();
    }
}