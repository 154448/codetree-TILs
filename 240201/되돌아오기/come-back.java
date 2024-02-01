import java.util.Scanner;

public class Main {
    public static int getDirection(char d){
        if(d == 'N'){
            return 0;
        }
        else if(d == 'E'){
            return 1;
        }
        else if(d == 'S'){
            return 2;
        }
        else{
            return 3;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        //N, E, S, W
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int x = 0;
        int y = 0;
        int t = 0;

        int res = -1;

        int c = 0;

        do{
            c += 1;
            char direction = userIn.next().charAt(0);
            int cnt = userIn.nextInt();

            int d = getDirection(direction);

            for(int i = 0; i < cnt; i++){
                x += dx[d];
                y += dy[d];
                t += 1;

                if(x == 0 && y == 0){
                    res = t;
                    break;
                }
            }
            if(x == 0 && y == 0){
                res = t;
                break;
            }
        }while(c < n);

        System.out.printf("%d", res);
    }
}