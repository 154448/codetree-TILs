import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] num = new int[3];

        for(int i = 0; i < 3; i++){
            num[i] = userIn.nextInt();
        }

        int cnt = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++){
                    int[] tmp = {i, j, k};

                    for(int idx = 0; idx < 3; idx++){
                        int diff = Math.abs(tmp[idx] - num[idx]);

                        if(diff <= 2){
                            cnt += 1;
                            break;
                        }
                    }
                }
            }
        }

        System.out.printf("%d", cnt);
    }
}