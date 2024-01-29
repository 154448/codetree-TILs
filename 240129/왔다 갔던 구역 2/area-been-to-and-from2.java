import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] intervals = new int[20001];

        int current = 1000;

        int n = userIn.nextInt();

        for(int i = 0; i < n; i++){
            int x = userIn.nextInt();
            char direction = userIn.next().charAt(0);

            if(direction == 'L'){
                current -= x;
            }

            for(int j = 0; j < x; j++){
                intervals[current + j] += 1;
            }

            current = direction == 'L' ? current : current + x;  
        }

        int cnt = 0;


        for(int i = 0; i < 2001; i++){
            cnt = intervals[i] >= 2 ? cnt + 1 : cnt;
        }

        System.out.printf("%d", cnt);
    }
}