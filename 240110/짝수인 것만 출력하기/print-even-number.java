import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] nums = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            int temp = userIn.nextInt();
            if(temp % 2 == 0){
                nums[cnt] = temp;
                cnt += 1;
            }
        }

        for(int i = 0; i < cnt; i++){
            System.out.printf("%d ", nums[i]);
        }
    }
}