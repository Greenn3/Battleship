public class Main {

    public static void main(String[] args) {
        int counter = 0;

        // write your code here
        Secret[] secrets = Secret.values();
        for(Secret secret: secrets ){
            String temp = secret.toString().substring(0,4);
           // System.out.println(temp);
            if (temp.equals("STAR")) {
                counter++;
            }
        }


        System.out.println(counter);
    }
}

 //sample enum for inspiration
/*enum Secret {
    STAR, CRASH, START, // ...
}

 */


