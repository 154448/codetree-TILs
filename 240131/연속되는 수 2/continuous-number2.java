import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] count = new int[1001];

        int n = userIn.nextInt();
        int[] num = new int[n];

        for(int k = 0; k < n; k++){
            num[k] = userIn.nextInt();
        }

        int cnt = 1;
        int value = num[0];
        count[num[0]] = 1;

        for(int i = 1; i < n; i++){
            if(num[i] == value){
                cnt += 1;
                if(i == n - 1){
                    count[value] = cnt;
                }
            }
            else{
                if(cnt > count[value]){
                    count[value] = cnt;
                }

                cnt = 1;
                value = num[i];
            }
        }

        int maxValue = 0;
        int maxCount = 0;

        for(int i = 0; i <= 1000; i++){
            if(maxCount < count[i]){
                maxValue = i;
                maxCount = count[i];
            }
        }

        System.out.printf("%d", maxCount);
    }
}