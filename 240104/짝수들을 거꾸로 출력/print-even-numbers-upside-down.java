import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        int n = userIn.nextInt();
        int[] num = new int[n];

        int cnt = 0;

        for(int i = 0; i < n; i++){
            int temp = userIn.nextInt();

            if(temp % 2 == 0){
                num[cnt] = temp;
                cnt += 1;
            }
        
        }

        for(int i = cnt - 1; i >= 0; i--){
            System.out.printf("%d ", num[i]);
        }


    }
}