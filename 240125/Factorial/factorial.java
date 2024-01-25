import java.util.Scanner;

public class Main {
    public static int factorial(int n){
        return n == 1 ? 1 : n * factorial(n - 1);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        System.out.printf("%d", factorial(n));
    }
}