import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        char c = userIn.next().charAt(0);
        int n = userIn.nextInt();

        System.out.printf("%d %c", (int)c, (char)n);
    }
}