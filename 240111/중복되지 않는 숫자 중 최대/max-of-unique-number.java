import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] num = new int[n];
        int[] count = new int[1001];

        for(int i = 0; i < n; i++){
            num[i] = userIn.nextInt();
        }

        for(int i = 0; i < n; i++){
            count[num[i]] += 1;
        }

        int maxValue = -1;

        for(int i = 0; i < n; i++){
            if((maxValue < num[i]) && (count[num[i]] == 1)){
                maxValue = num[i];
            }

        }

        System.out.printf("%d", maxValue);
    }
}