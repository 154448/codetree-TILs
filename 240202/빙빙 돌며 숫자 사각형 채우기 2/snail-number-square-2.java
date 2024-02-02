import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int[][] nums = new int[n][m];
        
        int r = 0;
        int c = 0;

        //Up, Right, Down, Left
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        int d = 2;

        for(int i = 1; i <= n * m; i++){
            nums[r][c] = i;

            r += dr[d];
            c += dc[d];

            if(r < 0 || c < 0 || r >=n || c >= m || nums[r][c] != 0){
                r -= dr[d];
                c -= dc[d];

                d -= 1;
                d = d < 0 ? d + 4 : d;

                r += dr[d];
                c += dc[d];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }
    }
}