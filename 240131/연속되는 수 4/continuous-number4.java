import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int maxLength = 1;

        int n = userIn.nextInt();
        int[] nums = new int[n];

        nums[0] = userIn.nextInt();

        int cnt = 1;
        // 0 : Increase , 1 : decrease

        for(int i = 1; i < n; i++){
            nums[i] = userIn.nextInt();

            if(nums[i - 1] < nums[i]){
                cnt += 1;
                if(i == n - 1){
                    maxLength = cnt > maxLength ? cnt : maxLength;
                }
            }
            else{
                maxLength = cnt > maxLength ? cnt : maxLength;
                cnt = 1;
            }
        }

        System.out.printf("%d", maxLength);
    }
}