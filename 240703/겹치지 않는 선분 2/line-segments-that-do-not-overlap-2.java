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
                int res = (low[i] - low[j]) * (high[i] * high[j]);

                temp += ((res < 0) ? 1 : 0);

                
            }
            
            if(temp == 0){
                cnt += 1;
            }
        }

        System.out.printf("%d", cnt);

    }
}