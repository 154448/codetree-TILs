import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int cnt = 0;

        int i = 1;

        while(cnt != 2){
            int num = n * i;
            System.out.printf("%d ", num);

            if(num % 5 == 0){
                cnt += 1;
            }
            
            i += 1;

        }
    }
}