import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int findMaxNum(int maxValue, int[] num){
        if(num.length == 0){
            return maxValue;
        }
        else{
            int currentMax = num[0] > maxValue ? num[0] : maxValue;
            return findMaxNum(currentMax, Arrays.copyOfRange(num, 1, num.length));
        }
        
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] num = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = userIn.nextInt();
        }

        System.out.printf("%d", findMaxNum(0, num));
    }
}