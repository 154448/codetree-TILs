import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[][] point = new int [2001][2001];

        int minR = 2001;
        int minC = 2001;

        int maxR = 0;
        int maxC = 0;

        int tot = 0;

        for(int k = 0; k < 2; k++){
            int x1 = userIn.nextInt() + 1000;
            int y1 = userIn.nextInt() + 1000;
            int x2 = userIn.nextInt() + 1000;
            int y2 = userIn.nextInt() + 1000;

            for(int x = x1; x < x2; x++){
                for(int y = y1; y < y2; y++){
                    if(point[x][y] != 1){
                        point[x][y] = 1;
                        tot += 1;
                    }
                }
            }
        }

        int x1 = userIn.nextInt() + 1000;
        int y1 = userIn.nextInt() + 1000;
        int x2 = userIn.nextInt() + 1000;
        int y2 = userIn.nextInt() + 1000;

        for(int x = x1; x < x2; x++){
            for(int y = y1; y < y2; y++){
                if(point[x][y] == 1){
                    point[x][y] = 0;
                    tot -= 1;
                }
            }
        }

        System.out.printf("%d", tot);

        
    }
}