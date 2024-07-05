import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] nums = new int[n + 1];

        for(int i = 1; i <= n; i++){
            nums[i] = userIn.nextInt();
        }

        int minDiffSum = Integer.MAX_VALUE;

        for(int i = 1; i <= n; i++){
            int[] tmp = nums.clone();

            tmp[i] = tmp[i] * 2;
            tmp[0] = tmp[2];
            
            for(int j = 1; j <= n; j++){
                int[] temp = tmp.clone();
                //삭제 수행
                temp[j] = temp[j - 1];
                //차이 합 구하기
                int diffSum = 0;
                for(int k = 2; k <= n; k++){
                    diffSum += Math.abs(temp[k] - temp[k - 1]);
                }
                //최솟값 찾기
                minDiffSum = Math.min(minDiffSum, diffSum);
            }
        }

        System.out.printf("%d", minDiffSum);
    }
}