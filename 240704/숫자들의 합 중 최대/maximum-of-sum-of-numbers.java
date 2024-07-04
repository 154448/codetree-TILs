import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int start = userIn.nextInt();
        int end = userIn.nextInt();

        int maxSum = 0;

        for(int i = start; i <= end; i++){
            int tot = 0;
            tot += (i / 10000);
            tot += (i / 1000);
            tot += (i / 100);
            tot += (i / 10);
            tot += (i % 10);

            // System.out.println(tot);

            maxSum = Math.max(maxSum, tot);
        }

        System.out.printf("%d", maxSum);
    }
}