import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] tempArr = new int[10];

        for(int i = 0; i < 10; i++){
            tempArr[i] = userIn.nextInt();
        }

        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            int temp = tempArr[i];
            if(temp < 250){
                sum += tempArr[i];
                cnt += 1;
            }
            else{
                break;
            }
            
        }

        System.out.printf("%d %.1f", sum, (double)sum/cnt);
    }
}