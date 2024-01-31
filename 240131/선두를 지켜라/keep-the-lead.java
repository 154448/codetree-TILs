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

            for(int i = 0; i < t; i++){
                locA[++tA] = locA[tA - 1] + v;
            }
        }

        for(int c = 0; c < m; c++){
            int v = userIn.nextInt();
            int t = userIn.nextInt();

            for(int i = 0; i < t; i++){
                locB[++tB] = locB[tB - 1] + v;
            }
        }

        int cnt = -1;
        char current = 's';

        for(int i = 0; i <= tA; i++){
            //우위 찾기
            char res = locA[i] > locB[i] ? 'A' : 'B';
            //System.out.printf("%d %d\n", locA[i], locB[i]);
            //같으면 우위 없음
            if (locA[i] == locB[i]){
                current = 's';
                continue;
            }
            //우위 발생, 전의 선두와 비교
            if(current != res){
                //우위 업데이트
                current = res;
                //변경
                cnt += 1;
            }
        }

        System.out.printf("%d", cnt);

        
    }
}