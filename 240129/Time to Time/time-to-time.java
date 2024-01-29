import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int a = userIn.nextInt();
        int b = userIn.nextInt();

        int c = userIn.nextInt();
        int d = userIn.nextInt();


        System.out.printf("%d", (c - a) * 60 + d - b);
    }
}