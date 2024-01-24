import java.util.Scanner;

public class Main {
    public static int computeSum(int[] num, int start, int last){
        int sum = 0;

        for(int i = start - 1; i < last; i++){
            sum += num[i];
        }

        return sum;

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = userIn.nextInt();
        }

        for(int i = 0; i < m; i++){
            int start = userIn.nextInt();
            int end = userIn.nextInt();

            System.out.printf("%d\n", computeSum(nums, start, end));
        }
    }
}