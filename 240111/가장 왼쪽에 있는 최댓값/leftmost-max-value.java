import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);
        
        int n = userIn.nextInt();

        int[] num =new int[n];
        for(int i = 0; i < n; i++){
            num[i] = userIn.nextInt();
        }

        int idx = n - 1;;

        while(idx > 0){
            int maxValue = num[0];
            int maxIdx = 0;

            for(int i = 0; i <= idx; i++){
                if(maxValue < num[i]){
                    maxValue = num[i];
                    maxIdx = i;
                }
            }

            idx = maxIdx - 1;

            System.out.printf("%d ", maxIdx + 1);

        }
    }
}