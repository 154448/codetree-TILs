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
            int v = userIn.nextInt();
            int t = userIn.nextInt();

            for(int j = 0; j < t; j++){
                locA[++tA] = locA[tA - 1] + v;
            }
        }

        for(int i = 0; i < m; i++){
            int v = userIn.nextInt();
            int t = userIn.nextInt();

            for(int j = 0; j < t; j++){
                locB[++tB] = locB[tB - 1] + v;
            }
        }

        int state = 0;
        int cnt = 0;

        for(int i = 0; i < tA; i++){
            if(locA[i] == locB[i]){
                if(state != 0){
                    cnt += 1;
                    state = 0;
                }
            }
            else if(locA[i] > locB[i]){
                if(state != 1){
                    cnt += 1;
                    state = 1;
                }
            }
            else{
                if(state != -1){
                    cnt += 1;
                    state = -1;
                }
            }
        }

        System.out.printf("%d", cnt);



    }
}