import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] fibo = new int[12];
        int end = 0;

        fibo[0] = 1;
        fibo[1] = userIn.nextInt();


        for(int i = 2; i <= 12; i++){
            int current = fibo[i - 1] + fibo[i - 2];

            fibo[i] = current;

            if(current >= 100){
                end = i;
                break;
            }
        }

        for(int i = 0; i <= end; i++){
            System.out.printf("%d ", fibo[i]);
        }
    }
}