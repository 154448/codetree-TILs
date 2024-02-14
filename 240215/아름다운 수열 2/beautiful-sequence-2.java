import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int[] first = new int[n];
        int[] second = new int[m];

        int cnt = 0;

        for(int i = 0; i < n; i++){
            first[i] = userIn.nextInt();
        }

        for(int i = 0; i < m; i++){
            second[i] = userIn.nextInt();
        }

        for(int s = 0; s < n - m + 1; s++){
            int[] appear = second.clone();

            //s(시작점) 부터 m개 만큼 탐색 시작
            for(int i = 0; i < m; i++){
                //현재 위치
                int idx = s + i;

                //현재 원소가 second 배열에 존재 하는 지 확인
                for(int j = 0; j < m; j++){
                    if(first[idx] == appear[j]){
                        appear[j] = 0;
                        break;
                    }
                }
            }

            boolean res = true;

            for(int i = 0; i < m; i++){
                if(appear[i] != 0){
                    res = false;
                    break;
                }
            }

            cnt += (res ? 1 : 0);
        }

        System.out.printf("%d", cnt);
    }
}