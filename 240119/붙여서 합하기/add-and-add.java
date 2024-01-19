import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String a = userIn.next();
        String b = userIn.next();

        String ab = a + b;
        String ba = b + a;

        int res = 0;

        for(int i = 0; i < ab.length(); i++){
            int tmp = (int)Math.pow(10, i);

            tmp *= (int)(ab.charAt(ab.length() - 1 - i) - 48);

            res += tmp;
        }

        for(int i = 0; i < ba.length(); i++){
            int tmp = (int)Math.pow(10, i);

            tmp *= (int)(ba.charAt(ab.length() - 1 - i) - 48);

            res += tmp;
        }

        System.out.printf("%d", res);
    }
}