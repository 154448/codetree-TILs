import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        char[] tile = new char[200001];
        int now = 100000;

        int n = userIn.nextInt();

        for(int k = 0; k < n; k++){
            int x = userIn.nextInt();
            char d = userIn.next().charAt(0);

            char color = (d == 'L') ? 'W' : 'B';

            for(int i = 0; i < x; i++){
                tile[now] = color;

                now = (d == 'L') ? now - 1 : now + 1;
            }

            now = (d == 'L') ? now + 1 : now - 1;
        }

        int cntW = 0;
        int cntB = 0;

        for(int i = 0; i < 200001; i++){
            if(tile[i] == 'W'){
                cntW += 1;
            }
            else if(tile[i] == 'B'){
                cntB += 1;
            }
        }

        System.out.printf("%d %d", cntW, cntB);
    }
}