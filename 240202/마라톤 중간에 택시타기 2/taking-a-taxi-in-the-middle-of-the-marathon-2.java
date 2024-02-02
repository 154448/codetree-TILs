import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for(int i = 0; i < n; i++){
            x[i] = userIn.nextInt();
            y[i] = userIn.nextInt();
        }

        int dist = 0;

        for(int i = 0; i < n - 1; i++){
            dist += (Math.abs(x[i + 1] - x[i]) + Math.abs(y[i + 1] - y[i]));
        }

        int minDist = dist;

        for(int i = 1; i < n - 2; i++){
            int tmpDist = dist - (Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1]));
            tmpDist -= (Math.abs(x[i + 1] - x[i]) + Math.abs(y[i + 1] - y[i]));

            tmpDist += (Math.abs(x[i + 1] - x[i - 1]) + Math.abs(y[i + 1] - y[i - 1]));

            minDist = Math.min(minDist, tmpDist);
        }

        System.out.printf("%d", minDist);
    }
}