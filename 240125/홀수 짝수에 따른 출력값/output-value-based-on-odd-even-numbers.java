import java.util.Scanner;

public class Main {
    public static int sumNums(int n){
        return n <= 2 ? n : n + sumNums(n - 2);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        System.out.printf("%d", sumNums(n));
    }
}