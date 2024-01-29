import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String target = userIn.next();

        int decimal = 0;
        int lastIdx = target.length() - 1;

        for(int i = lastIdx; i >= 0; i--){
            decimal += Math.pow(2, lastIdx - i) * (target.charAt(i) - '0');
        }

        System.out.printf("%d", decimal);
    }
}