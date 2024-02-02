import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int r = userIn.nextInt();
        int c = userIn.nextInt();

        char[][] block = new char[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                block[i][j] = userIn.next().charAt(0);
            }
        }
        char color = block[0][0];

        int cnt = 0;

        for(int i = 1; i < r; i++){
            for(int j = 1; j < c; j++){
                
                //시작점과 다른색
                if(block[i][j] != color){
                    for(int x = i + 1; x < r; x++){
                        for(int y = j + 1; y < c; y++){
                            //시작점과 같은 색
                            if(block[x][y] == color){
                                for(int a = x + 1; a < r; a++){
                                    for(int b = y + 1; b < c; b++){
                                        if(block[a][b] != color && a == r - 1 && b == c -1){
                                            cnt += 1;
                                        }

                                    }
                                }
                                
                            }
                        }
                    }
                }
            }
        }

        System.out.printf("%d", cnt);

        
    }
}