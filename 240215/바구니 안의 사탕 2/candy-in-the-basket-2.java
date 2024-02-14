import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int k = userIn.nextInt();

        int[] candy = new int[100];

        int maxSum = 0;

        for(int i = 0; i < n; i++){
            int c = userIn.nextInt();
            int idx = userIn.nextInt();

            candy[idx] = c;
        }

        for(int i = k; i < 100 - k; i++){
            int sum = 0;
            sum += candy[i];
            for(int j = 1; j <= k; j++){
                sum += candy[i - j];
                sum += candy[i + j];
            }
            maxSum = Math.max(sum, maxSum);
        }

        System.out.printf("%d", maxSum);
    }
}