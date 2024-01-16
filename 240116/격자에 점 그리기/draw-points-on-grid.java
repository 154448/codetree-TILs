import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int[][] point = new int[n][n];

        for(int i = 1; i <= m; i++){
            int r = userIn.nextInt() - 1;
            int c = userIn.nextInt() - 1;

            point[r][c] = i;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%d ", point[i][j]);
            }
            System.out.println();
        }
    }
}