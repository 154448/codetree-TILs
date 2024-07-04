import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int k = userIn.nextInt();
        int n = userIn.nextInt();

        int[][] history = new int[k][n];


        for(int i = 0; i < k; i++){
            for(int j = 0; j < n; j++){
                history[i][j] = userIn.nextInt();
            }
        }

        int cnt = 0;

        //i = first & j = second
        for(int i = 0; i < (n - 1); i++){
            for(int j = i + 1; j < n; j++){
                //pair 하나 설정
                int first = history[0][i];
                int second = history[0][j];

                //first가 나왔는지 기록
                boolean isFirst = false;
                //경우의 수가 깨졌는지 여부
                boolean state = true;

                for(int r = 1; r < k; r++){
                    if(state){
                        isFirst = false;
                        for(int t = 0; t < n; t++){
                            int key = history[r][t];
                            if(key == first){
                                isFirst = true;
                            }
                            else if(key == second){
                                if(!isFirst){
                                    state = false;
                                }
                                break;
                            }
                        }
                    }
                    else{
                        break;
                    }
                }
                if(state){
                    //System.out.printf("%d %d\n",first, second);
                    cnt += 1;
                }
            }
        }

        System.out.printf("%d", cnt);
    }
}