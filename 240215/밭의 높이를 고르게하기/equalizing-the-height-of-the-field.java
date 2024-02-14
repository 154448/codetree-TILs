import java.util.Scanner;
import java.util.Arrays;

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

        Arrays.sort(cost);

        int sum = 0;

        for(int i = 0; i < t; i++){
            sum += cost[i];
        }

        System.out.printf("%d", sum);
    }
}