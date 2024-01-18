import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.next();
        String newStr = "";

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            newStr += (c == str.charAt(1) ? str.charAt(0) : c);
        }

        System.out.printf("%s", newStr);
    }
}