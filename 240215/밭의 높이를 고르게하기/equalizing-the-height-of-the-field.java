import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int h = userIn.nextInt();
        int t = userIn.nextInt();

        int[] height = new int[n];
        int[] cost = new int[n];

        for(int i = 0; i < n; i++){
            int tmp = userIn.nextInt();

            cost[i] = Math.abs(tmp - h);
        }

        int minSum = 300;

        for(int s = 0; s <= n - t; s++){
            int sum = 0;

            for(int i = 0; i < t; i++){
                sum += cost[s + i];
            }

            minSum = Math.min(sum, minSum);
        }

        System.out.printf("%d", minSum);
    }
}