import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String n = userIn.next();

        int lastIdx = n.length() - 1;

        int decimal = 0;

        for(int i = lastIdx; i >= 0; i--){
            decimal += Math.pow(2, lastIdx - i) * (n.charAt(i) - '0');
        }

        decimal *= 17;

        String transferData = "";

        while(decimal >= 2){
            transferData = (decimal % 2) + transferData;

            decimal /= 2;
        }

        System.out.printf("%s", decimal + transferData);
    }
}