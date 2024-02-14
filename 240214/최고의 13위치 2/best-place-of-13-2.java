import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[][] plane = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                plane[i][j] = userIn.nextInt();
            }
        }

        int[] maxSum = new int[n];

        for(int r = 0; r < n; r++){
            int tmpM = 0;
            for(int c = 0; c < n - 2; c++){
                tmpM = Math.max(tmpM, plane[r][c] + plane[r][c + 1] + plane[r][c + 2]);
            }
            maxSum[r] = tmpM;
        }

        Arrays.sort(maxSum);

        System.out.printf("%d", maxSum[n - 1] + maxSum[n - 2]);


    }
}