import java.util.Scanner;

public class Main {
    public static int findMin(int a, int b, int c){
        int[] num = {a, b, c};

        int min = 101;

        for(int i = 0; i < 3; i++){
            if(num[i] < min){
                min = num[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int a = userIn.nextInt();
        int b = userIn.nextInt();
        int c = userIn.nextInt();

        System.out.printf("%d", findMin(a, b, c));
    }
}