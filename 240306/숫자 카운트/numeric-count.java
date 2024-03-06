import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] num = new int[n];
        int[] strike = new int[n];
        int[] ball = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = userIn.nextInt();
            strike[i] = userIn.nextInt();
            ball[i] = userIn.nextInt();
        }

        int cnt = 0;

        for(int x = 1; x <= 9; x++){
            for(int y = 1; y <= 9; y++){
                for(int z = 1; z <= 9; z++){

                    //서로 다른 숫자가 아닌 경우 Skip
                    if((x == y) || (x == z) || (y == z)){
                        continue;
                    }
                    else{

                        boolean isRight = true;

                        for(int i = 0; i < n; i++){
                            int a = num[i] / 100;
                            int b = (num[i] % 100) / 10;
                            int c = num[i] % 10;

                            int cntS = 0;
                            int cntB = 0;

                            //strike 여부 판단
                            if(x == a){
                                cntS += 1;
                            }
                            if(y == b){
                                cntS += 1;
                            }
                            if(z == c){
                                cntS += 1;
                            }

                            //ball 여부 확인
                            if(x == b || x == c){
                                cntB += 1;
                            }
                            if(y == a || y == c){
                                cntB += 1;
                            }
                            if(z == a || z == b){
                                cntB += 1;
                            }

                            if((cntS != strike[i]) || (cntB != ball[i])){
                                isRight = false;
                                break;
                            }
                        }

                        if(isRight){
                            cnt += 1;
                        }
                    }

                }
            }
        }

        System.out.printf("%d", cnt);


    }
}