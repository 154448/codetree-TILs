import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int k = userIn.nextInt();

        int[] blocks = new int[n];

        int maxValue = 0;

        for(int i = 0; i < k; i++){
            int start = userIn.nextInt() - 1;
            int end = userIn.nextInt() - 1;

            for(int j = start; j <= end; j++){
                blocks[j] += 1;

                if(blocks[j] > maxValue){
                    maxValue = blocks[j];
                }
            }

        }

        System.out.printf("%d", maxValue);
    }
}