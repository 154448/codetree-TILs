import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int end = 0;
        int tot = 0;

        int[] num = new int[10];

        for(int i = 0; i < 10; i++){
            int temp = userIn.nextInt();

            if(temp != 0){
                num[i] = temp;
                end = i;
            }
            else{
                break;
            }

        }

        for(int i = 0; i <= end; i++){
            tot += num[i];
        }

        System.out.printf("%d %.1f", tot, (double)tot / (end + 1));
    }
}