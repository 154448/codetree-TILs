import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int[] nums = new int[100];
        int end = 0;


        for(int i = 0; i < 100; i++){
            int temp = userIn.nextInt();

            if(temp == 0){
                end = i;
                break;
            }
            else{
                nums[i] = temp;
            }
        }

        for(int i = 0; i < end; i++){
            int num = nums[i];

            if(num % 2 == 0){
                System.out.printf("%d ", num / 2);
            }
            else{
                System.out.printf("%d ", num + 3);
            }
        }
    }
}