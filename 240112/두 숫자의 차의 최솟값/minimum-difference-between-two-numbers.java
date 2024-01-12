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

        int min = 100;

        for(int i = 0; i < n - 1; i++){
            int diff = nums[i + 1] - nums[i];

            if(min > diff){
                min = diff;
            }
        }

        System.out.printf("%d", min);
    }
}