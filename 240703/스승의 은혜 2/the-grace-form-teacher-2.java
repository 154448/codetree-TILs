import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int b = userIn.nextInt();

        int[] p = new int[n];

        for(int i = 0; i < n; i++){
            p[i] = userIn.nextInt();
        }

        Arrays.sort(p);

        int temp = 0;

        for(int i = 0; i < n; i++){
            temp += p[i];
            if(temp > b){
                temp -= (p[i] / 2);
                if(temp > b){
                    temp = i;
                }
                else{
                    temp = i + 1;
                }
                break;
            }
        }

        System.out.printf("%d", temp);
    }
}