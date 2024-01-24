import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = userIn.nextInt();
        }

        int tot = 0;

        while(m >= 1){
            tot += nums[m - 1];

            m = (m % 2 == 0) ? m / 2 : m - 1;
        }

        System.out.printf("%d", tot);
    }
}