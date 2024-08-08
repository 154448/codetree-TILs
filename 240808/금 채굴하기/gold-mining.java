import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner 선언
        Scanner userIn = new Scanner(System.in);
        
        // n :격자점 크기
        int n = userIn.nextInt();
        // m : 금화 가격
        int m = userIn.nextInt();

        //금화 위치를 저장하는 배열
        int[][] gold = new int[n][n];

        //금화 위치를 입력받아 저장
        for(int i = 0; i < n * n; i++){
            //행과 열의 위치 지정
            int r = i / n;
            int c = i % n;
            //입력받아 저장
            gold[r][c] = userIn.nextInt();
        }

        int maxCount = 0;

        int k = -1;

        do{
            k += 1;

            int cost = 2 * (k * k + k) + 1;

            for(int x = 0; x < n; x++){
                for(int y = 0; y < n; y++){
                    //이번 탐색 시 금화 개수 더함
                    int sum = 0;
                
                    for(int i = 0; i <= k; i++){
                        int start = y - (k - i);
                        int end = y + (k - i);

                        try{
                            for(int c = start; c <= end; c++){
                                sum += gold[x + i][c];
                            }
                        }catch(ArrayIndexOutOfBoundsException e){
                            sum += 0;
                        }

                        try{
                            for(int c = start; c <= end; c++){
                                sum += gold[x - i][c];
                            }
                        }catch(ArrayIndexOutOfBoundsException e){
                            sum += 0;
                        }
                        

                        if(i == 0){
                            sum = (int)sum / 2;
                        }
                    }

                    if(sum * m >= cost){
                        maxCount = Math.max(maxCount, sum);
                    }
                }
            }
        }while((2 * k + 1) < n);

        System.out.printf("%d", maxCount);


    }
}