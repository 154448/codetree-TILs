import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[][] plane = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                plane[i][j] = userIn.nextInt();
            }
        }

        int[] maxSum = new int[n];
        int[] rowMax = new int[n];

        for(int r = 0; r < n; r++){
            int tmpM = 0;
            
            int tmpC = 0;

            for(int c = 0; c < n - 2; c++){
                int tmp = plane[r][c] + plane[r][c + 1] + plane[r][c + 2];
                if(tmp > tmpM){
                    tmpM = tmp;
                    tmpC = c;
                }
            }

            int secondM = 0;

            for(int c = 0; c < n - 2; c++){
                int tmp = 0;
                for(int k = 0; k < 3; k++){
                    int tC = c + k;
                    
                    if(tC >= tmpC || tC <= (tmpC + 2)){
                        tmp = 0;
                        break;
                    }
                    else{
                        tmp += plane[r][c];
                    }
                }
                secondM = Math.max(secondM, tmp);
            }

            maxSum[r] = tmpM;
            rowMax[r] = tmpM + secondM;
        }

                                              
        Arrays.sort(maxSum);
        Arrays.sort(rowMax);

        System.out.printf("%d", maxSum[n - 1] + maxSum[n - 2] > rowMax[n - 1] ? maxSum[n - 1] + maxSum[n - 2] : rowMax[n -1]);


    }
}