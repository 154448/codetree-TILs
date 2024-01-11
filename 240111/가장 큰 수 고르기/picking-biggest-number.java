import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] num = new int[10];

        for(int i = 0; i < 10; i++){
            num[i] = userIn.nextInt();
        }

        int maxValue = num[0];

        for(int i = 0; i < 10; i++){
            if(maxValue < num[i]){
                maxValue = num[i];
            }
        }

        System.out.printf("%d", maxValue);
    }
}