import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] nums = new int[n];

        int[] k = new int[101];

        for(int i = 0; i < n; i++){
            nums[i] = userIn.nextInt();
        }

        for(int i = 0; i < n-1; i++){
            for(int j = i + 1; j < n; j++){
                int front = nums[i];
                int end = nums[j];

                int idx = (front + end) * 10 / 2;

                if((idx % 10) == 0){
                    k[idx / 10] += 1;
                }

            }
        }

        int result = -1;

        for(int i = 1; i <= 100; i++){
            result = Math.max(result, k[i]);
        }

        System.out.printf("%d", result);
    }
}