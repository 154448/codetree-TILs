import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] point = new int[100];
        int[] line = new int[n * 2];
        
        //선상에 기록 & 선분 시작점과 끝점 기록
        for(int i = 0; i < n; i++){
            int start = userIn.nextInt();
            int end = userIn.nextInt();

            line[2 * i] = start;
            line[2 * i + 1] = end;

            for(int p = start; p <= end; p++){
                point[p] += 1;
            }
        }

        int cnt = 0;

        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    int[] temp = point.clone();

                    int[] num = new int[3];
                    num[0] = i;
                    num[1] = j;
                    num[2] = k;

                    for(int x = 0; x < 3; x++){
                        for(int p = line[2 * num[x]]; p <= line[2 * num[x] + 1]; p++){
                            temp[p] -= 1;
                        }
                    }

                    boolean isRight = true;

                    for(int p = 0; p < 100; p++){
                        if(temp[p] > 1){
                            isRight = false;
                            break;
                        }
                    }

                    cnt += (isRight) ? 1 : 0;

                    // if(isRight){
                    //     System.out.printf("%d %d %d\n", i, j, k);
                    // }

                }

            }
        }

        System.out.printf("%d", cnt);
    }
}