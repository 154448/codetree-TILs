import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = userIn.nextInt() - 1;
        }

        int maxSum = 0;

        //s : 시작점
        for(int s = 0; s < n; s++){
            int sum = 0;
            int idx = s;
            for(int c = 0; c < m; c++){
                sum += (nums[idx] + 1);
                idx = nums[idx];
            }

            maxSum = Math.max(sum, maxSum);

        }

        System.out.printf("%d", maxSum);
    }
}