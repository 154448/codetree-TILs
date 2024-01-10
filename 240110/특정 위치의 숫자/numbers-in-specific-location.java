import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int[] num = new int[10];

        for(int i = 0; i < 10; i++){
            num[i] = userIn.nextInt();
        }

        System.out.printf("%d", num[2] + num[4] + num[9]);
    }
}