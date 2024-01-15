import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[][] nums = new int[n][n];


        for(int i = 0; i < n; i++){
            for(int j = 0; j<= i; j++){
                if(j == 0 || j == i){
                    nums[i][j] = 1;
                }
                else{
                    nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j];
                }

            }

        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }
    }
}