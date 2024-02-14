import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int s = userIn.nextInt();

        int[] nums = new int[n];
        int tot = 0;

        for(int i = 0; i < n; i++){
            int tmp = userIn.nextInt();
            tot += tmp;
            nums[i] = tmp;
        }

        int diff = s;
        int[] target = new int[2];

        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                int tmp = tot - (nums[i] + nums[j]);

                if(diff > Math.abs(s - tmp)){
                    diff = Math.abs(s - tmp);
                    target[0] = nums[i];
                    target[1] = nums[j];
                }
            }
        }

        System.out.printf("%d", diff);
    }
}