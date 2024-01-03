import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int[] num = new int[10];

        for(int i = 0; i < 10; i++){
            num[i] = userIn.nextInt();
        }

        int tot = 0;
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            if(num[i] != 0){
                tot += num[i];
                cnt += 1;
            }
            else{
                break;
            }
        }

        System.out.printf("%d %.1f", tot, (double)tot / cnt);

    }
}