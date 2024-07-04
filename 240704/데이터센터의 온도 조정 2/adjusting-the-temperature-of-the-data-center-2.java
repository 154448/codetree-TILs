import java.util.Scanner;

public class Main {
    public static int judgeGrade(int t, int ta, int tb){
        int answer = 0;
        if(t < ta){
            answer = 0;
        }
        else if(t > tb){
            answer = 2;
        }
        else{
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int c = userIn.nextInt();
        int g = userIn.nextInt();
        int h = userIn.nextInt();

        int[] work = new int[3];
        work[0] = c;
        work[1] = g;
        work[2] = h;

        int[][] temp = new int[n][2];

        for(int i = 0; i < n; i++){
            temp[i][0] = userIn.nextInt();
            temp[i][1] = userIn.nextInt();
        }

        int maxWork = 0;


        for(int t = 0; t <= 1003; t++){

            int workTot = 0;

            for(int i = 0; i < n; i++){
                workTot += work[judgeGrade(t, temp[i][0], temp[i][1])];
            }

            maxWork = Math.max(maxWork, workTot);

        }

        System.out.printf("%d", maxWork);

    }
}