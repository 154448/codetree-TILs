import java.util.Scanner;
import java.util.Arrays;

class Info implements Comparable<Info>{
    int idx;
    int x;
    int y;

    public Info(int idx, int x, int y){
        this.idx = idx;
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int compareTo(Info other){
        return this.idx - other.idx;
    }

    
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int k = userIn.nextInt();
        int p = userIn.nextInt();
        int t = userIn.nextInt();

        Info[] information = new Info[t];

        int[][] state = new int[n][2];
        state[p - 1][0] = 1;
        state[p - 1][1] = 0;


        for(int i = 0; i < t; i++){
            int s = userIn.nextInt();
            int x = userIn.nextInt() - 1;
            int y = userIn.nextInt() - 1;

            information[i] = new Info(s, x, y);
        }

        Arrays.sort(information);

        int cnt = 0;

        for(int i = 0; i < t; i++){
            int x = information[i].getX();
            int y = information[i].getY();


            if(state[x][0] == 1 && state[x][1] < k){
                state[x][1] += 1;
                state[y][1] = state[y][0] == 0 ? 0 : state[y][1] + 1;
                state[y][0] = 1;
            }
            else if(state[y][0] == 1 && state[y][1] < k){
                state[y][1] += 1;
                state[x][1] = state[x][0] == 0 ? 0 : state[x][1] + 1;
                state[x][0] = 1;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.printf("%d", state[i][0]);
        }
    }
}