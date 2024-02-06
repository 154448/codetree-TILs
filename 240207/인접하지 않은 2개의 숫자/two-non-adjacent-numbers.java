import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = userIn.nextInt();
        }

        int maxSum = 0;

        for(int i = 0; i < n - 2; i++){
            for(int j = i + 2; j < n; j++){
                int tmp = nums[i] + nums[j];

                maxSum = Math.max(tmp, maxSum);
            }
        }

        System.out.printf("%d", maxSum);
    }
}