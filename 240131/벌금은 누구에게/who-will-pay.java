import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int m = userIn.nextInt();

        int k = userIn.nextInt();

        int[] student = new int[100];

        int res = -1;

        for(int i = 0; i < m; i++){
            int num = userIn.nextInt();

            student[num] += 1;

            if(student[num] == k){
                res = num;
                break;
            }
        }

        System.out.printf("%d", res);
    }
}