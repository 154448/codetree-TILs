import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int cnt = 0;

        int[] firstComb = new int[3];
        int[] secondComb = new int[3];

        for(int i = 0; i < 3 ; i++){
            firstComb[i] = userIn.nextInt();
        }

        for(int i = 0; i < 3 ; i++){
            secondComb[i] = userIn.nextInt();
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++){
                    int[] comb = {i, j, k};

                    boolean firstRes = true;

                    for(int x = 0; x < 3; x++){
                        int tmp = Math.abs(firstComb[x] - comb[x]);
                        int diff = Math.min(tmp, n - tmp);

                        if(diff > 2){
                            firstRes = false;
                            break;
                        }
                        else{
                            firstRes = true;
                        }
                    }

                    boolean secondRes = true;

                    for(int x = 0; x < 3; x++){
                        int tmp = Math.abs(secondComb[x] - comb[x]);
                        int diff = Math.min(tmp, n - tmp);

                        if(diff > 2){
                            secondRes = false;
                            break;
                        }
                    }

                    if(firstRes || secondRes){
                        cnt += 1;
                    }
                }
            }
        }

        System.out.printf("%d", cnt);
    }
}