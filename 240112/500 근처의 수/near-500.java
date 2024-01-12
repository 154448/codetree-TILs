import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] min = new int[10];
        int[] max = new int[10];

        int cntm = 0;
        int cntM = 0;

        for(int i = 0; i < 10; i++){
            int num = userIn.nextInt();

            if(num < 500){
                min[cntm] = num;
                cntm += 1;
            }
            else if(num > 500){
                max[cntM] = num;
                cntM += 1;
            }

        }

        int maxValue = 0;
        for(int i = 0; i < cntm; i++){
            if(min[i] > maxValue){
                maxValue = min[i];
            }
        }

        int minValue = 1000;
        for(int i = 0; i < cntM; i++){
            if(max[i] < minValue){
                minValue = max[i];
            }
        }

        System.out.printf("%d %d", maxValue, minValue);
    }
}