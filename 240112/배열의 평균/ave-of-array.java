import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[][] nums = new int[2][4];

        int row[] = new int[2];
        int col[] = new int[4];
        int sum = 0;

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                nums[i][j] = userIn.nextInt();
            }
        }

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                int target = nums[i][j];
                row[i] += target;
                col[j] += target;
                sum += target;
            }
        }

        System.out.printf("%.1f %.1f\n", (double)row[0]/4, (double)row[1]/4);
        System.out.printf("%.1f %.1f %.1f %.1f\n", (double)col[0]/2, (double)col[1]/2, (double)col[2]/2, (double)col[3]/2);
        System.out.printf("%.1f", (double)sum / 8);
    }
}