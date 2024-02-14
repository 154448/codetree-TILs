import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int r = userIn.nextInt();
        int c = userIn.nextInt();
        userIn.nextLine();

        char[][] plane = new char[r][c];

        for(int i = 0; i < r; i++){
            String tmp = userIn.nextLine();

            for(int j = 0; j < c; j++){
                plane[i][j] = tmp.charAt(j);
            }

        }

        int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

        int cnt = 0;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(plane[i][j] == 'L'){

                    for(int k = 0; k < 8; k++){
                        int tCnt = 0;

                        for(int o = 1; o <= 2; o++){
                            int tR = i + (dx[k] * o);
                            int tC = j + (dy[k] * o);

                            if(tR < 0 || tR >= r || tC < 0 || tC >= c){
                                break;
                            }
                            
                            if(plane[tR][tC] == 'E'){
                                tCnt += 1;
                            }

                            else{
                                break;
                            }
                        }

                        if(tCnt == 2){
                            cnt += 1;
                        }

                    }
                }
            }
        }

        System.out.printf("%d", cnt);
    }
}