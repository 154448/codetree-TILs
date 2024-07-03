import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();//몇 명의 사람인지
        int m = userIn.nextInt();//치즈의 수
        int d = userIn.nextInt();//치즈 먹은 레코드 수
        int s = userIn.nextInt();//아픈 레코드 수

        //누가, 무엇을 -> 언제
        int[][] userRecord = new int[n + 1][m + 1];

        //누가 폭식했는지 기록
        for(int i = 0; i < d; i++){
            int who = userIn.nextInt();
            int what = userIn.nextInt();
            int when = userIn.nextInt();

            userRecord[who][what] = when;
        }

        //치즈의 상태
        int[] state = new int[m + 1];
        //사람들 상태
        int[] checkState = new int[n + 1];

        //맛탱이간 치즈 기록
        for(int k = 0; k < s; k++){
            int who = userIn.nextInt();
            int when = userIn.nextInt();

            checkState[who] = 1;

            for(int i = 1; i <= m; i++){
                if(userRecord[who][i] != 0){
                    if(userRecord[who][i] < when){
                        state[i] = 1;
                    }
                }
            }
        }

        for(int i = 1; i <= n; i++){
            if(checkState[i] == 1){
                for(int j = 1; j <= m; j++){
                    if(userRecord[i][j] == 0){
                        state[j] = 0;
                    }
                }
            }
        }

        // for(int i = 1; i <= m; i++){
        //     System.out.printf("%d ", state[i]);
        // }

        for(int i = 1; i <= n; i++){
            if(checkState[i] == 1){
                continue;
            }
            else{
                int[] temp = userRecord[i];

                for(int j = 1; j <= m; j++){
                    if((state[j] == 1) && (temp[j] != 0)){
                        s += 1;
                        break;
                    }
                }
            }
        }

        System.out.printf("%d", s);


    }
}