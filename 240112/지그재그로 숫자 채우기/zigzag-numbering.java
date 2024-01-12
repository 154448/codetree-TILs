import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int[][] nums = new int[n][m];

        int num = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i % 2 == 0){
                    nums[j][i] = num++;
                }
                else{
                    nums[n - j - 1][i] = num++;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("%d ", nums[i][j]);
            }
            System.out.printf("\n");
        }
    }
}