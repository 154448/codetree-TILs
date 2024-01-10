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

        for(int i = 0; i < n; i++){
            nums[i] *= nums[i];
        }

        for(int i = 0; i < n; i++){
            System.out.printf("%d ", nums[i]);
        }


    }
}