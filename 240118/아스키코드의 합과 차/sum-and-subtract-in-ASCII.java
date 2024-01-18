import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        char a = userIn.next().charAt(0);
        char b = userIn.next().charAt(0);

        System.out.printf("%d %d", (int)a + b, (int)a > (int)b? (int)a - b : (int)b - a);
    }
}