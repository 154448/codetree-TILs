import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int a = userIn.nextInt();
        int b = userIn.nextInt();

        String n = userIn.next();

        int decimal = 0;
        int lastIdx = n.length() - 1;

        for(int i = lastIdx; i >= 0; i--){
            decimal += Math.pow(a, lastIdx - i) * (n.charAt(i) - '0');
        }

        String res = "";

        while(decimal >= b){
            res = (decimal % b) + res;

            decimal /= b;
        }

        System.out.printf("%s", decimal + res);

    }
}