import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] intervals = new int[201];

        for(int i = 0; i < n; i++){
            int start = userIn.nextInt() + 100;
            int end = userIn.nextInt() + 100;

            for(int j = start; j < end; j++){
                intervals[j] += 1;
            }
        }

        int res = 0;

        for(int i = 0; i < 201; i++){
            res = intervals[i] > res ? intervals[i] : res;
        }

        System.out.printf("%d", res);
    }
}