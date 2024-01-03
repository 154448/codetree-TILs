import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] num = new int[10];

        for(int i = 0; i < 10; i++){
            num[i] = userIn.nextInt();
        }

        int cnt = 0;
        int sum = 0;

        for(int i = 0; i < 10; i++){
            if(num[i] == 0){
                break;
            }
            else if(num[i] % 2 == 0){
                sum += num[i];
                cnt += 1;
            }
        }

        System.out.printf("%d %d", cnt, sum);
    }
}