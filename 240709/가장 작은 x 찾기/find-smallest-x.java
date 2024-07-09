import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] candidate = new int[10000];

        int n = userIn.nextInt();

        for(int k = 1; k <= n; k++){
            int start = userIn.nextInt();
            int end = userIn.nextInt();

            for(int i = start; i <= end; i++){
                if(i % Math.pow(2, k) == 0){
                    candidate[i / (int)Math.pow(2, k)]++;
                }
            }
        }

        for(int i = 0; i < 10000; i++){
            if(candidate[i] == n){
                System.out.printf("%d", i);
                break;
            }
        }
    }
}