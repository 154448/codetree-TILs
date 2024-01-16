import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int maxLength = 0;
        int minLength = 20;


        for(int i = 0; i < 3; i++){
            String str = userIn.next();

            int len = str.length();

            maxLength = maxLength < len ? len : maxLength;
            minLength = minLength > len ? len : minLength;

        }


        System.out.printf("%d", maxLength - minLength);
    }
}