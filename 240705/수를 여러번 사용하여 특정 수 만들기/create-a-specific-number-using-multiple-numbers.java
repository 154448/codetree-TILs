import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);
        
        int a = userIn.nextInt();
        int b = userIn.nextInt();

        int c = userIn.nextInt();

        int maxSum = 0;

        for(int i = 0; i <= (c / a); i++){
            for(int j = 0; j <= (c / b); j++){
                int sum = (i * a) + (j * b);

                if(sum <= c){
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }

        System.out.printf("%d", maxSum);
    }
}