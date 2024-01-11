import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] nums = new int[10];
        Arrays.fill(nums, 0);

        for(int i = 0; i < n; i++){
            int temp = userIn.nextInt();

            nums[temp] += 1;
        }

        for(int i = 1; i < 10; i++){
            System.out.printf("%d \n", nums[i]);
        }
    }
}