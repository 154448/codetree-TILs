import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int num = 0;
        int[][] nums = new int[n][m];

        for(int i = 0; i < m; i++){
            int x = 0;
            for(int j = i; j >= 0; j--){
                nums[x++][j] = ++num;
            }
        }

        for(int i = 1; i < n; i++){
            int c = m - 1;
            for(int j = i; j < n; j++){
                nums[j][c--] = ++num;
            }
        }


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("%d ", nums[i][j]);
            }
            System.out.printf("\n");;
        }
    }
}