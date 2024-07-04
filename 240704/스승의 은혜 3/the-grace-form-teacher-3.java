import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int budget = userIn.nextInt();

        int[] price = new int[n];
        int[] cost = new int[n];

        for(int i = 0; i < n; i++){
            price[i] = userIn.nextInt();
            cost[i] = userIn.nextInt();
        }

        int cnt = 0;

        //i는 쿠폰을 사용할 대상
        for(int i = 0; i < n; i++){
            
            int[] total = new int[n];

            for(int j = 0; j < n; j++){
                if(i == j){
                    total[j] = (price[i] / 2) + cost[i];
                }
                else{
                    total[j] = price[j] + cost[j];
                }
            }            

            Arrays.sort(total);

            int tot = 0;
            int lastPerson = 0;

            for(int j = 0; j < n; j++){
                tot += total[j];
                lastPerson += 1;

                if(tot > budget){
                    lastPerson -= 1;
                    break;
                }
            }
            cnt = Math.max(lastPerson, cnt);
        }

        System.out.printf("%d", cnt);

    }
}