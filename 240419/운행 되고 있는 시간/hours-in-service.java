import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);

        //직원 수
        int n = userIn.nextInt();
        //직원들이 일하는 시간을 저장하는 배열
        int[] working = new int[1001];

        int[][] workTime = new int[n][2];

        //직원들이 일하는 시간을 기록
        for(int i = 0; i < n; i++){
            int start = userIn.nextInt();
            int end = userIn.nextInt();

            workTime[i][0] = start;
            workTime[i][1] = end; 

            for(int j = start; j < end; j++){
                working[j] = working[j] + 1;
            }
        }

        int maxWorking = 0;

        for(int i = 0; i < n; i++){
            int[] tmp = working.clone();
            int tot = 0;

            for(int j = workTime[i][0]; j < workTime[i][1]; j++){
                tmp[j] -= 1;
            }

            for(int j = 0; j <= 1000; j++){
                tot += (tmp[j]> 0 ? 1 : 0);
            }

            maxWorking = Math.max(maxWorking, tot);
        }

        System.out.printf("%d", maxWorking);

    }
}