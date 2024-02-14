import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[][] plane = new int[19][19];

        for(int i = 0; i < 19; i++){
            for(int j = 0; j < 19; j++){
                plane[i][j] = userIn.nextInt();
            }
        }

        boolean res = true;

        for(int r = 0; r < 19; r++){
            for(int c = 0; c < 19; c++){
                int current = plane[r][c];
                if(current != 0){

                    int cnt = 0;

                    //가로 5개 -----------------
                    for(int i = 0; i < 5; i++){
                        int tR = r;
                        int tC = c + i;

                        if(tR < 0 || tR >= 19 || tC < 0 || tC >= 19){
                            break;
                        }

                        if(plane[tR][tC] == current){
                            cnt += 1;
                        }
                        else{
                            break;
                        }
                    }
                    if(cnt == 5){
                        System.out.printf("%d\n%d %d", current, r + 1, c + 3);
                        res = false;
                        break;
                    }

                    //세로 5개
                    cnt = 0;
                    for(int i = 0; i < 5; i++){
                        int tR = r + i;
                        int tC = c;

                        if(tR < 0 || tR >= 19 || tC < 0 || tC >= 19){
                            break;
                        }

                        if(plane[tR][tC] == current){
                            cnt += 1;
                        }
                        else{
                            break;
                        }
                    }
                    if(cnt == 5){
                        System.out.printf("%d\n%d %d", current, r + 3, c + 1);
                        res = false;
                        break;
                    }

                    //대각선 내리막
                    cnt = 0;
                    for(int i = 0; i < 5; i++){
                        int tR = r + i;
                        int tC = c + i;

                        if(tR < 0 || tR >= 19 || tC < 0 || tC >= 19){
                            break;
                        }

                        if(plane[tR][tC] == current){
                            cnt += 1;
                        }
                        else{
                            break;
                        }
                    }
                    if(cnt == 5){
                        System.out.printf("%d\n%d %d", current, r + 3, c + 3);
                        res = false;
                        break;
                    }

                    //대각선 오르막
                    cnt = 0;
                    for(int i = 0; i < 5; i++){
                        int tR = r - i;
                        int tC = c + i;

                        if(tR < 0 || tR >= 19 || tC < 0 || tC >= 19){
                            break;
                        }

                        if(plane[tR][tC] == current){
                            cnt += 1;
                        }
                        else{
                            break;
                        }
                    }
                    if(cnt == 5){
                        System.out.printf("%d\n%d %d", current, r - 1, c + 3);
                        res = false;
                        break;
                    }
                }
            }
        }

        if(res){
            System.out.printf("%d", 0);
        }


    }
}