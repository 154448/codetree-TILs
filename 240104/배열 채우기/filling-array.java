import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int[] arr = new int[10];
        int end = 0;

        for(int i = 0; i < 10; i++){
            int temp = userIn.nextInt(); 
            if(temp != 0){
                arr[i] = temp;
                end = i;
            }
            else{
                break;
            }
        }

        for(int i = end; i >= 0; i--){
            System.out.printf("%d ", arr[i]);
        }

    }
}