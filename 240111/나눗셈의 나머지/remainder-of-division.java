import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int a = userIn.nextInt();
        int b = userIn.nextInt();

        int[] count = new int[b];
        Arrays.fill(count, 0);

        while(a > 0){
            count[a % b] += 1;
            a /= b;
        }

        int tot = 0;

        for(int i = 0; i < b; i++){
            tot += (count[i] * count[i]);
        }

        System.out.printf("%d ", tot);
    }
}