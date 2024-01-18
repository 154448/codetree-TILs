import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String s = userIn.next();
        int n = s.length();

        for(int i = 0; i <= n; i++){
            System.out.printf("%s\n", s);
            String newStr = s.charAt(n - 1) + s.substring(0, n - 1);
            s = newStr;
        }
    }
}