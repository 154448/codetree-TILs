import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[][] point = new int[n][2];

        int[] x = new int[40001];
        int[] y = new int[40001];


        for(int i = 0; i < n; i++){
            int xPoint = userIn.nextInt();
            int yPoint = userIn.nextInt();

            point[i][0] = xPoint;
            point[i][1] = yPoint;

            x[xPoint] = 1;
            y[yPoint] = 1;
        }

        int minValue = 160000;

        for(int i = 0; i < n; i++){
            int[] xTmp = x.clone();
            int[] yTmp = y.clone();

            int[] width = new int[2];
            int[] height = new int[2];

            boolean xInit = true;
            boolean yInit = true;

            xTmp[point[i][0]] = 0;
            yTmp[point[i][1]] = 0;

            //검색 코인
            for(int j = 1; j < 40001; j++){
                if(xTmp[j] != 0){
                    if(xInit){
                        xInit = false;
                        width[0] = j;
                    }

                    width[1] = Math.max(j, width[1]);
                }

                if(yTmp[j] != 0){
                    if(yInit){
                        yInit = false;
                        height[0] = j;
                    }

                    height[1] = Math.max(j, height[1]);
                }
            }

            int tmp = (height[1] - height[0]) * (width[1] - width[0]);

            minValue = Math.min(minValue, tmp);

        }

        System.out.printf("%d", minValue);


    }
}