import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int k = userIn.nextInt();

        int maxLength = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++){
            int tmp = userIn.nextInt();

            if(tmp > k){
                cnt += 1;
                if(i == n - 1){
                    maxLength = cnt > maxLength ? cnt : maxLength;
                }
            }
            else{
                maxLength = cnt > maxLength ? cnt : maxLength;
                cnt = 0;
            }
        }

        System.out.printf("%d", maxLength);
    }
}