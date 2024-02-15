import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int tot = 0;
        int[] num = new int[6];

        for(int i = 0; i < 6; i++){ 
            int tmp = userIn.nextInt();
            num[i] = tmp;
            tot += tmp;
        }

        int diff = 4000000;

        for(int i = 0; i < 4; i++){
            for(int j = i + 1; j < 5; j++){
                for(int k = j + 1; k < 6; k++){
                    int sum = num[i] + num[j] + num[k];

                    diff = Math.min(diff, Math.abs(tot - sum * 2));

                }
            }
        }

        System.out.printf("%d", diff);


    }
}