import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[][] nums = new int[n][n];

        int num = 0;
        int cnt = 0;

        for(int i = n - 1; i >= 0; i--){
            for(int j = 0; j < n; j++){
                if(cnt % 2 == 0){
                    nums[n - 1 - j][i] = ++num;
                }
                else{
                    nums[j][i] = ++num;
                }
                cnt += 1;
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