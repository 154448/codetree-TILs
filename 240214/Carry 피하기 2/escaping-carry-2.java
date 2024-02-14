import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = userIn.nextInt();
        }

        int maxSum = 9;

        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 2; j++){
                for(int k = j + 1; k < n; k++){
                    boolean res = true;

                    int a = nums[i];
                    int b = nums[j];
                    int c = nums[k];

                    do{
                        int tA = a % 10;
                        int tB = b % 10;
                        int tC = c % 10;

                        a /= 10;
                        b /= 10;
                        c /= 10;
                        if(tA + tB + tC >= 10){
                            res = false;
                            break;
                        }
                    }while(a > 0 || b > 0 || c > 0);

                    if(res){
                        maxSum = Math.max(maxSum, nums[i] + nums[j] + nums[k]);
                    }
                }
            }
        }

        System.out.printf("%d", maxSum);
    }
}