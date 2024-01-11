import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] nums = new int[10];

        nums[0] = userIn.nextInt();
        nums[1] = userIn.nextInt();

        for(int i = 2; i < 10; i++){
            nums[i] = nums[i - 1] + 2 * nums[i - 2];
        }

        for(int i = 0; i < 10; i++){
            System.out.printf("%d ", nums[i]);
        }
    }
}