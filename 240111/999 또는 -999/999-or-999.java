import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int[] num = new int[100];
        int idx = 0;

        for(int i = 0; i < 100; i++){
            int temp = userIn.nextInt();

            if((temp == 999) || (temp == -999)){
                idx = i;
                break;
            }
            else{
                num[i] = temp;
            }
        }

        int minValue = num[0];
        int maxValue = num[0];

        for(int i = 0; i < idx; i++){
            if(minValue > num[i]){
                minValue = num[i];
            }
            if(maxValue < num[i]){
                maxValue = num[i];
            }
        }

        System.out.printf("%d %d", maxValue, minValue);
    }
}