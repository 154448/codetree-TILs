import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] nums = new int[n];

        int maxHeight = 0;

        for(int i = 0; i < n; i++){
            int now = userIn.nextInt();

            nums[i] = now;

            maxHeight = Math.max(now, maxHeight);
        }

        int maxCount = 0;

        for(int i = 0; i < maxHeight; i++){
            // System.out.printf("%d ", i);
            int[] temp = nums.clone();

            for(int j = 0; j < n; j++){
                temp[j] -= i;
            }

            int count = 0;
            boolean isZero = true;

            for(int j = 0; j < n; j++){
                //현재 0이 아님 직전 0 -> 새로운 빙하 등장
                if((temp[j] != 0) && (isZero)){
                    // System.out.printf("//%d//", j);
                    count++;
                }

                isZero = (temp[j] == 0)? true : false;
            }

            // System.out.println(count);

            maxCount = Math.max(maxCount, count);
        }

        System.out.printf("%d", maxCount);
    }
}