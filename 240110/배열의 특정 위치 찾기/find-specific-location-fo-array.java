import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int[] num = new int[10];

        int sum = 0;
        int avg = 0;

        for(int i = 0; i<10; i++){
            num[i] = userIn.nextInt();
        }

        for(int i = 0; i < 10; i++){
            if(i % 2 == 1){
                sum += num[i];
            }
            if((i + 1) % 3 == 0){
                avg += num[i];
            }
        }

        System.out.printf("%d %.1f", sum, (double)avg / 3);
    }
}