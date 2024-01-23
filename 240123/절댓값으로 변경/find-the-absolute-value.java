import java.util.Scanner;

public class Main {
    public static void toAbsoluteNum(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] < 0 ? arr[i] * -1 : arr[i];
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int[] num = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = userIn.nextInt();
        }

        toAbsoluteNum(num);

        for(int i = 0; i < n; i++){
            System.out.printf("%d ",num[i]);
        }
    }
}