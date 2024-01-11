import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] num = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = userIn.nextInt();
        }

        int minValue = num[0];

        for(int i = 0; i < n; i++){
            if(num[i] < minValue){
                minValue = num[i];
            }
        }

        int count = 0;
        
        for(int i = 0; i < n; i++){
            if(num[i] == minValue){
                count += 1;
            }
        }

        System.out.printf("%d %d", minValue, count);
    }
}