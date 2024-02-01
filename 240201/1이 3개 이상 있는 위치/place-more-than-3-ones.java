import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int[][] plane = new int[n][n];

        //북, 동, 남, 서
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                plane[i][j] = userIn.nextInt();
            }
        }

        int cnt = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int tot = 0;
                
                for(int c = 0; c < 4; c++){
                    int x = i + dx[c];
                    int y = j + dy[c];

                    if(x < 0 || x > n -1 || y < 0 || y > n - 1){
                        continue;
                    }

                    tot += plane[x][y];
                }

                if(tot >= 3){
                    cnt += 1;
                }
            }
        }
        System.out.printf("%d", cnt);
    }
}