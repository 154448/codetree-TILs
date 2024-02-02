import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        //Up, Right, Down, Left
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int[][] alphabet = new int[n][m];

        int r = 0;
        int c = 0;
        int d = 1;

        int num = 65;

        for(int i = 0; i < n * m; i++){
            alphabet[r][c] = num;

            num += 1;

            if(num > 90){
                num = 65;
            }

            r += dr[d];
            c += dc[d];

            if(r < 0 || c < 0 || r >= n || c >=m || alphabet[r][c] != 0){
                r -= dr[d];
                c -= dc[d];

                d += 1;
                d = d >= 4 ? d % 4 : d;

                r += dr[d];
                c += dc[d];
            }
        }


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("%c ", (char)alphabet[i][j]);
            }
            System.out.println();
        }
    }
}