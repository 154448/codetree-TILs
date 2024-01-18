import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.next();

        while(str.length() > 1){
            int idx = userIn.nextInt();

            idx = idx >= str.length() ? str.length() - 1 : idx;

            String newStr = str.substring(0, idx) + str.substring(idx + 1);

            System.out.printf("%s\n", newStr);

            str = newStr;
        }
    }
}