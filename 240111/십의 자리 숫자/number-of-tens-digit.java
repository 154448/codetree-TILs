import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int[] count = new int[10];
        Arrays.fill(count, 0);

        int end = 0;

        for(int i = 0; i < 100; i++){
            int temp = userIn.nextInt();
            if(temp == 0){
                end = i;
                break;
            }
            else{
                count[temp / 10] += 1;
            }
        }
        for(int i = 1; i < 10; i++){
            System.out.printf("%d - %d\n", i, count[i]);
        }
    }
}