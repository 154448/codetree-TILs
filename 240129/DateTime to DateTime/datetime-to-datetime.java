import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int a = userIn.nextInt();
        int b = userIn.nextInt();
        int c = userIn.nextInt();

        int totMin = (a - 11) * 24 + (b - 11);
        totMin = totMin * 60 + (c - 11);

        System.out.printf("%d", totMin < 0 ? -1 : totMin);
    }
}