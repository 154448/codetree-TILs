import java.util.Scanner;

public class Main {
    public static void changeIntArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = (arr[i] % 2 == 0)? arr[i] / 2 : arr[i];
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = userIn.nextInt();
        }

        changeIntArr(nums);

        for(int i = 0; i < n; i++){
            System.out.printf("%d ", nums[i]);
        }
    }
}