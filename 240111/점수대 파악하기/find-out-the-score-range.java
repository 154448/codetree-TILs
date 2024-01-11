import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] count = new int[11];
        Arrays.fill(count, 0);

        for(int i = 0; i < 100; i++){
            int num = userIn.nextInt();

            if(num == 0){
                break;
            }
            else{
                count[num / 10] += 1;
            }
        }

        for(int i = 10; i > 0; i--){
            System.out.printf("%d0 - %d\n", i, count[i]);
        }
    }
}