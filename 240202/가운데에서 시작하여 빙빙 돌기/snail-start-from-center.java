import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[][] nums = new int[n][n];

        //Up, Right, Down, Left
        int[] dr ={-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        int r = n / 2;
        int c = n / 2;

        int d = 2;

        for(int i = 1; i <= n * n; i++){
            nums[r][c] = i;

            int tmp = d - 1;
            tmp = tmp < 0 ? tmp + 4 : tmp;

            int tR = r + dr[tmp];
            int tC = c +dc[tmp];

            if(nums[tR][tC] == 0 ){
                r = tR;
                c = tC;

                d = tmp;
            }
            else{
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