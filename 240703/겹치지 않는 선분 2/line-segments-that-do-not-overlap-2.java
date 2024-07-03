import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] low = new int[100];
        int[] high = new int[100];

        for(int i = 0; i < n; i++){
            low[i] = userIn.nextInt();
            high[i] = userIn.nextInt();
        }

        int cnt = 0;

        for(int i = 0; i < n; i++){
            
            int temp = 0;

            for(int j = 0; j < n; j++){
                if(j == i){
                    continue;
                }
                //low가 큰 경우
                if(low[i] < low[j]){
                    //high는 작은 경우
                    if(high[i] >= high[j]){
                        temp += 1;
                    }
                }
                //low가 작은 경우
                else{
                    //high가 큰 경우
                    if(high[j] >= high[i]){
                        temp += 1;
                    }
                }
            }

            cnt += (temp == 0 ? 0 : 1);
        }

        System.out.printf("%d", cnt);

    }
}