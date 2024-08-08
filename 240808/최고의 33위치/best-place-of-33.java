import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);
        
        //n을 입력 받음
        int n = userIn.nextInt();

        //동전의 위치를 저장하는 배열
        int[][] coins = new int[n][n];

        //주어진 구간에서 최대 코인의 개수
        int maxSum = 0;

        //동전의 위치를 입력받아 저장
        for(int i = 0; i < n * n; i++){
            int r = i / n;
            int c = i % n;

            coins[r][c] = userIn.nextInt();
        }

        int[] dx = {-1, 0, 1};
        int[] dy = {-1, 0, 1};

        for(int i = 1; i < n - 1; i++){
            for(int j = 1; j < n - 1; j++){
                int sum = 0;

                for(int x = 0; x < 3; x++){
                    for(int y = 0; y < 3; y++){
                        sum += coins[i + dx[x]][j + dy[y]];
                    }
                }

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}