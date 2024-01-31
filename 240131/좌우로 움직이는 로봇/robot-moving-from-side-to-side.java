import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int[] locA = new int[1000001];
        int[] locB = new int[1000001];

        int tA = 0;
        int tB = 0;

        for(int i = 0; i < n; i++){
            int c = userIn.nextInt();
            char d = userIn.next().charAt(0);

            int direction = d == 'R' ? 1 : -1;

            for(int j = 0; j < c; j++){
                locA[++tA] = locA[tA - 1] + direction;
            }
        }

        for(int i = 0; i < m; i++){
            int c = userIn.nextInt();
            char d = userIn.next().charAt(0);

            int direction = d == 'R' ? 1 : -1;

            for(int j = 0; j < c; j++){
                locB[++tB] = locB[tB - 1] + direction;
            }
        }

        int cnt = 0;
        char state = 's';

        for(int i = 0; i <= (tA > tB ? tA : tB); i++){
            if(locA[i > tA ? tA : i] == locB[i > tB ? tB : i]){
                if(state != 's'){
                    cnt += 1;
                    state = 's';
                }
            }
            else{
                state = 'd';
            }

        }

        System.out.printf("%d", cnt);
    }
}