import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] nums = new int[10];

        for(int i = 0; i < 10; i++){
            nums[i] = userIn.nextInt();
        }

        int sum  = 0;
        int sum_ = 0;

        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                sum += nums[i];
            }
            else{
                sum_ += nums[i];
            }
        }

        System.out.printf("%d", sum>sum_?sum-sum_:sum_-sum);
    }
}