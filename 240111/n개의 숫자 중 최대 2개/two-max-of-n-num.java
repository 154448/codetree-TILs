import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] num = new int[n];
        int[] sortedNum = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = userIn.nextInt();
        }

        int maxIdx = 0;

        for(int i = 0; i < n; i++){
            int maxValue = num[0];
            for(int j = 0; j < n; j++){
                if(num[j] > maxValue){
                    maxIdx = j;
                    maxValue = num[j];
                }
            }
            sortedNum[i] = maxValue;
            num[maxIdx] = (int)(Math.pow(2, 32) * -1);
        }

        System.out.printf("%d %d", sortedNum[0], sortedNum[1]);
    }
}