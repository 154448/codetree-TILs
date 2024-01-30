import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[][] point = new int[201][201];

        int tot = 0;

        for(int j = 0; j < 2; j++){
            int x1 = userIn.nextInt() + 100;
            int y1 = userIn.nextInt() + 100;
            int x2 = userIn.nextInt() + 100;
            int y2 = userIn.nextInt() + 100;

            for(int x = x1; x < x2; x++){
                for(int y = y1; y < y2; y++){
                    point[x][y] = 1;
                    
                }
            }
        }

        for(int i = 0; i < 201; i++){
            for(int j = 0; j < 201; j++){
                tot += point[i][j];
            }
        }

        System.out.printf("%d", tot);
    }
}