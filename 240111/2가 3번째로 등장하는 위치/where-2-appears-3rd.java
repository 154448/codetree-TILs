import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int cnt = 0;
        int[] num = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = userIn.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(num[i] == 2){
                cnt += 1;

                if(cnt == 3){
                    System.out.println(i + 1);
                }
            }
        }
    }
}