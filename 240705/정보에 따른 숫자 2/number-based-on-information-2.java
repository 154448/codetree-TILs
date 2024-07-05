import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int t = userIn.nextInt();
        int a = userIn.nextInt();
        int b = userIn.nextInt();

        char[] line = new char[1001];

        for(int i = 0; i < t; i++){
            char key = userIn.next().charAt(0);

            line[userIn.nextInt()] = key;
        }

        int result = 0;

        for(int x = a; x <= b; x++){
            int distS = 1000;
            boolean isFindS = true;

            int distSR = 1000;
            boolean isFindSR = true;

            int distN = 1000;
            boolean isFindN = true;

            int distNR = 1000;
            boolean isFindNR = true;

            //순방향
            int dist = 0;
            for(int i = x; i <= 1000; i++){
                if(isFindS &&  (line[i] == 'S')){
                    isFindS = false;
                    distS = dist;
                }
                else if(isFindN &&  (line[i] == 'N')){
                    isFindN = false;
                    distN = dist;
                }
                dist++;
            }

            //역방향
            dist = 0;
            for(int i = x; i > 0; i--){
                if(isFindSR &&  (line[i] == 'S')){
                    isFindSR = false;
                    distSR = dist;
                }
                else if(isFindNR &&  (line[i] == 'N')){
                    isFindNR = false;
                    distNR = dist;
                }
                dist++;
            }

            distS = Math.min(distS, distSR);
            distN = Math.min(distN, distNR);

            if(distS <= distN){
                result++;
            }
        }

        System.out.printf("%d", result);
    }
}