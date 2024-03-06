import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[][] point = new int[n][2];
        int[] x = new int[1001];
        int[] y = new int[1001];

        for(int i = 0; i < n; i++){
            int xTmp = userIn.nextInt();
            int yTmp = userIn.nextInt();

            x[xTmp] = 1;
            y[yTmp] = 1;

            point[i][0] = xTmp;
            point[i][1] = yTmp;
        }

        int minDist = 2000000;


        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                int dist = (int)Math.pow((point[i][0] - point[j][0]), 2) + (int)Math.pow((point[i][1] - point[j][1]), 2);

                minDist = Math.min(dist, minDist);
            }
        }

        System.out.printf("%d", minDist);
    }
}