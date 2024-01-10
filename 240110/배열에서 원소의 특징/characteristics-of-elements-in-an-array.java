import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] nums= new int[10];

        for(int i = 0; i < 10; i++){
            nums[i] = userIn.nextInt();
        }


        for(int i = 0; i < 10; i++){
            if(nums[i] % 3 == 0){
                System.out.printf("%d", nums[i - 1]);
                break;
            }
        }
    }
}