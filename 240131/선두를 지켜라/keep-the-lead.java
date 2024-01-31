import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] locA = new int[1000001];
        int[] locB = new int[1000001];

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int tA = 0;
        int tB = 0;

        for(int c = 0; c < n; c++){
            int v = userIn.nextInt();
            int t = userIn.nextInt();

            for(int i = 0; i < c; i++){
                locA[tA + 1] = locA[tA] + v;
                tA += 1;
            }
        }

        for(int c = 0; c < m; c++){
            int v = userIn.nextInt();
            int t = userIn.nextInt();

            for(int i = 0; i < t; i++){
                locB[tB + 1] = locB[tB] + v;
                tB += 1;
            }
        }

        int cnt = 0;
        char current = 's';

        for(int i = 0; i < tA; i++){
            char res = locA[i] > locB[i] ? 'A' : 'B';
            if (locA[i] == locB[i]){
                current = 's';
                continue;
            }

            if(current != res){
                current = res;
                cnt += 1;
            }
        }

        System.out.printf("%d", cnt);

        
    }
}