import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = userIn.nextInt();
        }

        int tot = 0;
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            if(arr[i] == 0){
                break;
            }
            else if(arr[i] % 2 == 0){
                tot += arr[i];
                cnt += 1;
            }

        }

        System.out.printf("%d %d", cnt, tot);
    }
}