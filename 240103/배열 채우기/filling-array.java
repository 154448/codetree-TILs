import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int deadline = 0;
        int[] num = new int[10];

        for(int i = 0; i < 10; i++){
            int temp = userIn.nextInt();
            
            if(temp != 0){
                num[i] = temp;
                deadline = i;
            }
            else{
                break;
            }
        }

        for(int i = deadline; i >= 0; i--){
                System.out.printf("%d ", num[i]);
        }


    }
}