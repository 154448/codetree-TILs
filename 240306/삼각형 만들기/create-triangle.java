import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int maxDist = 0;

        int[][] point = new int[n][2];

        //점들을 이차원 배열로 입력 받기
        for(int i = 0; i < n; i++){
            point[i][0] = userIn.nextInt();
            point[i][1] = userIn.nextInt();
        }

        for(int i = 0; i < n - 1; i++){
            int[] x = new int[100];
            int cntX = 0;
            int[] y = new int[100];
            int cntY = 0;

            Arrays.fill(x, 101);
            Arrays.fill(y, 101);

            for(int j = 0; j < n; j++){
                if(i == j){
                    continue;
                }
                if(point[i][0] == point[j][0]){
                    x[cntX] = j;
                    cntX += 1;
                }

                if(point[i][1] == point[j][1]){
                    y[cntY] = j;
                    cntY += 1;
                }
            }

            //System.out.printf("%d %d\n", cntX, cntY);

            for(int a = 0; a < cntX; a++){
                for(int b = 0; b < cntY; b++){
                    int idxX = x[a];
                    int idxY = y[b];

                    int s = ((point[i][0] * point[idxX][1]) + (point[idxX][0] * point[idxY][1]) + (point[idxY][0] * point[i][1])) - ((point[idxX][0] * point[i][1]) + (point[idxY][0] * point[idxX][1]) + (point[i][0] * point[idxY][1]));

                    maxDist = Math.max(maxDist, s);
                }
            }
        }

        System.out.printf("%d", maxDist);
    }
}