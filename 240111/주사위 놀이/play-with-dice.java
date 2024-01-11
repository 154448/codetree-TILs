import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] count = new int[7];
        Arrays.fill(count, 0);

        for(int i = 0; i <10; i++){
            int num = userIn.nextInt();

            count[num] += 1;
        }

        for(int i = 1; i < 7; i++){
            System.out.printf("%d - %d\n", i, count[i]);
        }
    }
}