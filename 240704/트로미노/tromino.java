import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int[][] nums = new int[n + 2][m + 2];

        for (int[] i : nums) Arrays.fill(i, -5000);

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                nums[i][j] = userIn.nextInt();
            }
        }

        int maxSum = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                maxSum = Math.max((nums[i][j] + nums[i][j - 1] + nums[i - 1][j]), maxSum);
                maxSum = Math.max((nums[i][j] + nums[i][j + 1] + nums[i - 1][j]), maxSum);
                maxSum = Math.max((nums[i][j] + nums[i][j - 1] + nums[i + 1][j]), maxSum);
                maxSum = Math.max((nums[i][j] + nums[i][j + 1] + nums[i + 1][j]), maxSum);

                maxSum = Math.max((nums[i][j] + nums[i][j - 1] + nums[i][j + 1]), maxSum);
                maxSum = Math.max((nums[i][j] + nums[i - 1][j] + nums[i + 1][j]), maxSum);
            }
        }

        System.out.printf("%d", maxSum);

    }
}