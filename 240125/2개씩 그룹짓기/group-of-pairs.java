import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt() * 2;

        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = userIn.nextInt();
        }
        
        Arrays.sort(nums);

        int[] maxValue = new int[n / 2];

        for(int i = 0; i < n / 2; i++){
            maxValue[i] = nums[i] + nums[n - 1 - i];
        }

        Arrays.sort(maxValue);

        System.out.printf("%d", maxValue[n / 2 - 1]);

        
    }
}