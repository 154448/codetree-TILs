import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        char c = userIn.next().charAt(0);

        int n = (int)c;

        n += 1;

        n = n > 122 ? n - 26 : n;

        System.out.printf("%c", (char)n);
    }
}