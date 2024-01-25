import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int k = userIn.nextInt();

        String[] nums = new String[n];

        int cnt = 0;

        String t = userIn.next();


        for(int i = 0; i < n; i++){
            nums[i] = userIn.next();

            if(nums[i].contains(t)){
                cnt += 1;
            }
        }

        String[] targets = new String[cnt];
        cnt = 0;

        for(int i = 0 ; i < n; i++){
            if(nums[i].contains(t)){
                targets[cnt++] = nums[i];
            }
        }

        Arrays.sort(targets);

        System.out.printf("%s", targets[k - 1]);


    }
}