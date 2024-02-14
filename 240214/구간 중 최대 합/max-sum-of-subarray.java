import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int s = userIn.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = userIn.nextInt();
        }

        int maxSum = 0;

        for(int i = 0; i < n - s + 1; i++){
            int sum = 0;

            for(int j = 0; j < s; j++){
                sum += nums[i + j];
            }

            maxSum = Math.max(sum, maxSum);

        }
        System.out.printf("%d", maxSum);
    }
}