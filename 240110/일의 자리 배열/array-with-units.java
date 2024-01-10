import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] fibo = new int[10];

        fibo[0] = userIn.nextInt();
        fibo[1] = userIn.nextInt();

        for(int i = 2; i < 10; i++){
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        for(int i = 0; i < 10; i++){
            System.out.printf("%d ", fibo[i] % 10);
        }
    }
}