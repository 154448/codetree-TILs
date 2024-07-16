import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int[][] section = new int[m][2];

        for(int i = 0; i < m; i++){
            int first = userIn.nextInt();
            int second = userIn.nextInt();

            section[i][0] = Math.min(first, second);
            section[i][1] = Math.max(first, second);
        }

        int maxCnt = 0;

        for(int s = 0; s < m; s++){
            int cnt = 0;

            for(int i = 0; i < m; i++){
                if((section[s][0] == section[i][0]) && (section[s][1] == section[i][1])){
                    cnt += 1;
                }
            }

            maxCnt = Math.max(cnt, maxCnt);
        }

        System.out.printf("%d", maxCnt);
        

    }
}