import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] nums = new int[n];
        Arrays.fill(nums, 101);

        for(int i = 0; i < n; i++){
            nums[i] = userIn.nextInt();
            if(i % 2 == 0){
                Arrays.sort(nums);
                System.out.printf("%d ", nums[(i + 1)/ 2]);
            }

        }
    }
}