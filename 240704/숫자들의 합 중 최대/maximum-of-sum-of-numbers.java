import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int start = userIn.nextInt();
        int end = userIn.nextInt();

        int maxSum = 0;

        for(int i = start; i <= end; i++){
            int tot = 0;
            int now = i;

            tot += (now / 10000);
            now = now % 10000;
            tot += (now / 1000);
            now = now % 1000;
            tot += (now / 100);
            now = now % 100;
            tot += (now / 10);
            tot += (now % 10);

            // System.out.println(tot);

            maxSum = Math.max(maxSum, tot);
        }

        System.out.printf("%d", maxSum);
    }
}