import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = userIn.nextInt();
        }

        int cnt = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == m){
                cnt += 1;
            }
        }

        System.out.printf("%d", cnt);
    }
}