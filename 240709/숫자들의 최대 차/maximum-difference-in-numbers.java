import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int k = userIn.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = userIn.nextInt();
        }

        Arrays.sort(nums);

        int cnt = 0;

        for(int s = 0; s < n - 1; s++){
            for(int e = s + 1; e < n; e++){
                if((nums[e] - nums[s]) <= k){
                    cnt = Math.max(cnt, (e - s + 1));
                }
            }
        }

        System.out.printf("%d", cnt);
    }
}