import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int[][] nums = new int[n][n];

        for(int i = 0; i < m; i++){
            int r = userIn.nextInt() - 1;
            int c = userIn.nextInt() - 1;

            nums[r][c] = 1;

        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }


    }
}