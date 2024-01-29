import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] intervals = new int[101];

        int maxValue = 0;


        for(int k = 0; k < n; k++){
            int start = userIn.nextInt();
            int end = userIn.nextInt();

            for(int i = start; i <= end; i++){
                intervals[i] += 1;
                
                maxValue = intervals[i] > maxValue ? intervals[i] : maxValue;
            }
        }

        System.out.printf("%d", maxValue);
    }
}