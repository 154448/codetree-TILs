import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] nums = new int[n + 1];

        for(int i = 1; i <= n; i++){
            nums[i] = userIn.nextInt();
        }

        int minDiffSum = Integer.MAX_VALUE;


        for(int i = 1; i <= n; i++){
            int[] temp = nums.clone();

            temp[i] = temp[i] * 2;
            temp[0] = temp[2];

            int diffSum = 0;
            for(int j = 1; j <= n; j++){
                temp[j] = temp[j - 1];
                for(int k = 2; k <= n; k++){
                    diffSum += Math.abs(temp[k] - temp[k - 1]);
                }
                minDiffSum = Math.min(minDiffSum, diffSum);
            }
        }

        System.out.printf("%d", minDiffSum);
    }
}