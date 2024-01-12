import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int num = 0;

        int[][] nums = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                nums[j][i] = ++num;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%d ", nums[i][j]);
            }
            System.out.printf("\n");
        }
    }
}