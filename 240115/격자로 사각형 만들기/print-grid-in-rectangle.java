import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[][] nums = new int[n][n];


        for(int j = 0; j < 2; j++){
            for(int i = 0; i < n; i++){
                if(j == 0){
                    nums[0][i] = 1;
                }
                else{
                    nums[i][0] = 1;
                }
            }
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                nums[i][j] = nums[i][j - 1] + nums[i - 1][j] + nums[i -1][j - 1];
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