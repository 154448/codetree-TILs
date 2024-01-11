import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] count = new int[4];
        Arrays.fill(count, 0);

        for(int i = 0; i < 3; i++){
            char sym = userIn.next().charAt(0);
            int temp = userIn.nextInt();

            if(sym=='Y'){
                if(temp >= 37){
                    count[0] += 1;
                }
                else{
                    count[2] += 1;
                }
            }
            else{
                if(temp >= 37){
                    count[1] += 1;
                }
                else{
                    count[3] += 1;
                }
            }
        }

        for(int i = 0; i < 4; i++){
            System.out.printf("%d ", count[i]);
        }

        if(count[0] >= 2){
            System.out.printf("%c", 'E');
        }
    }
}