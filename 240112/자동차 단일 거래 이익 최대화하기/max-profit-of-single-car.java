import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] price = new int[n];

        for(int i = 0; i < n; i++){
            price[i] = userIn.nextInt();
        }

        int maxProfit = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int profit = price[j] - price[i];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        System.out.printf("%d", maxProfit);
    }
}