import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int[] num = new int[100];

        int loc = 0;

        for(int i = 0; i < 100; i++){
            int temp = userIn.nextInt();

            if(temp == 0){
                loc = i;
                break;
            }
            else{
                num[i] = temp;
            }
        }


        System.out.printf("%d", num[loc - 1] + num[loc - 2] + num[loc - 3]);
   
    }
}