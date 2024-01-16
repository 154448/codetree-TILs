import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int[][] point = new int[n][n];

        for(int i = 0; i < m; i++){
            int r = userIn.nextInt();
            int c = userIn.nextInt();

            point[r - 1][c - 1] = r * c;
        }


        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%d ", point[i][j]);
            }
            System.out.println();
        }
    }
}