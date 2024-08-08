import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[][] nums = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                nums[i][j] = userIn.nextInt();
            }
        }

        int maxSum = 0;

        int[] dr = {-1, -1, 1, 1};
        int[] dc = {1, -1, -1, 1};

        for(int r = 2; r < n; r++){
            for(int c = 1; c < n - 1; c++){

                int cr = r;
                int cc = c;

                for(int w = 1; w < n; w++){
                    for(int h = 1; h < n; h++){

                        int sum = 0;

                        try{
                            for(int i = 0; i < 4; i++){

                                int end = (i % 2 == 0) ? w : h;
                                
                                for(int k = 0; k < end; k++){
                                        sum += nums[cr][cc];
                                        cr += dr[i];
                                        cc += dc[i];
                                }
                            }

                            maxSum = Math.max(maxSum, sum);
                        }
                        catch(ArrayIndexOutOfBoundsException e){
                            continue;
                        }
                    }
                }
            }
        }
        System.out.printf("%d", maxSum);
    }
}