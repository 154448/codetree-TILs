import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] coordinate = new int[2 * n];

        boolean res = false;

        for(int i = 0; i < n; i++){
            coordinate[2 * i] = userIn.nextInt();
            coordinate[2 * i + 1] = userIn.nextInt();
        }

        loop:
        for(int i = 0; i < 2 * n - 2; i++){
            for(int j = i + 1; j < 2 * n - 1; j++){
                for(int k = j + 1; k < 2 * n; k++){
                    int[] point = new int[n];

                    int[] line = new int[3];
                    line[0] = i;
                    line[1] = j;
                    line[2] = k;

                    for(int x = 0; x < 3; x++){
                        int now = coordinate[line[x]];
                        int offset = 0;

                        if(line[x] % 2 != 0){
                            offset = 1;
                        }

                        for(int q = 0; q < n; q++){
                            if(coordinate[2 * q + offset] == now){
                                point[q] = 1;
                            }
                        }
                    }
                   

                    int cnt = 0;

                    for(int q = 0; q < n; q++){
                        if(point[q] == 1){
                            cnt += 1;
                        }
                    }

                    if(cnt == n){
                        res = true;
                        break loop;
                    }


                }
            }
        }

        System.out.printf("%d", res ? 1 : 0);
    }
}