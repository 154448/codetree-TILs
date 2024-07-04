import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int[][] numsR = new int[n][n];
        int[][] numsC = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int num = userIn.nextInt();
                numsR[i][j] = num;
                numsC[j][i] = num;
            }
        }

        int cnt = 0;

        for(int i = 0; i < n; i++){
            int targetR = numsR[i][0];
            int targetC = numsC[i][0];

            int cntR = 0;
            int cntC = 0;

            for(int j = 0; j < n; j++){
                if(numsR[i][j] == targetR){
                    cntR++;
                    if(cntR >= m){
                        cnt++;
                        break;
                    }
                }
                else{
                    targetR = numsR[i][j];
                    cntR = 1;
                }
            }

            for(int j = 0; j < n; j++){
                if(numsC[i][j] == targetC){
                    cntC++;
                    if(cntC >= m){
                        cnt++;
                        break;
                    }
                }
                else{
                    targetC = numsC[i][j];
                    cntC = 1;
                }
            }
        }

        System.out.printf("%d", cnt);



    }
}