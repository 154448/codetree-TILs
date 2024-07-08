import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for(int i = 0; i < n; i++){
            x[i] = userIn.nextInt();
            y[i] = userIn.nextInt();
        }

        int minX = 0;
        int minY = 0;

        int minPoint = 100;

        for(int i = 0; i < 100; i++){
            for(int j = 0;j < 100; j++){
                int[] cntPoint = new int[4];

                for(int p = 0; p < n; p++){
                    if((x[p] <= i) && (y[p] >= j)){
                        cntPoint[0]++;
                    }
                    else if((x[p] >= i) && (y[p] >= j)){
                        cntPoint[1]++;
                    }
                    else if((x[p] >= i) && (y[p] <= j)){
                        cntPoint[2]++;
                    }
                    else if((x[p] <= i) && (y[p] <= j)){
                        cntPoint[3]++;
                    }
                }

                int maxPoint = Math.max(Math.max(cntPoint[0], cntPoint[1]), Math.max(cntPoint[2], cntPoint[3]));

                minPoint = Math.min(minPoint, maxPoint);
            }
        }

        System.out.printf("%d", minPoint);
    }
}