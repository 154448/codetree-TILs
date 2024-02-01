import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int n = userIn.nextInt() + 2;
        int m = userIn.nextInt();

        int[][] plane = new int[n][n];

        for(int i = 0; i < m; i++){
            int x = userIn.nextInt();
            int y = userIn.nextInt();

            plane[x][y] = 1;

            int tot = 0;

            for(int j = 0; j < 4; j++){
                tot += plane[x + dx[j]][y + dy[j]];
            }

            System.out.printf("%d\n", tot == 3 ? 1 : 0);

        }
    }
}