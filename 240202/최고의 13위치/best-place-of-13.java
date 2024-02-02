import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[][] num = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                num[i][j] = userIn.nextInt();
            }
        }

        int maxValue = 0;

        for(int i = 0; i < n; i++){
            int res = num[i][0] + num[i][1] + num[i][2];

            maxValue = Math.max(maxValue, res);

            for(int j = 3; j < n; j++){
                res = res - num[i][j - 3] + num[i][j];
                maxValue = Math.max(maxValue, res);
            }
        }

        System.out.printf("%d", maxValue);
    }
}