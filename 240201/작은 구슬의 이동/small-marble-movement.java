import java.util.Scanner;

public class Main {
    public static int getDirection(char d){
        int res = -1;
        if(d == 'U'){
            res = 0;
        }
        else if(d == 'D'){
            res = 2;
        }

        else if(d == 'R'){
            res = 1;
        }
        else if(d == 'L'){
            res = 3;
        }

        return res;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);
        //U, R, D, L
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        int n = userIn.nextInt();
        int t = userIn.nextInt();

        int r = userIn.nextInt();
        int c = userIn.nextInt();

        char d = userIn.next().charAt(0);

        int direction = getDirection(d);

        for(int i = 0; i < t; i++){
            r += dr[direction];
            c += dc[direction];

            //벽을 만난 경우
            if(r > n || c > n || r < 1 || c <1){
                r -= dr[direction];
                c -= dc[direction];

                direction = (direction + 2) % 4;
            }
        }

        System.out.printf("%d %d", r, c);


    }
}