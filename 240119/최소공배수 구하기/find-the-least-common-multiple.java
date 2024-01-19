import java.util.Scanner;

public class Main {
    public static void findNum(int n, int m){
        int s = n > m ? m : n;
        int b = n > m ? n : m;

        int key = 0;

        //최대 공약수 찾기
        for(int i = 1; i <= s; i++){
            if(b % i == 0 && s % i == 0){
                key = i;
            }
        }

        int cnt = 1;

        while(true){
            int tmp = key * cnt++;

            if(tmp % s == 0 && tmp % b == 0){
                System.out.printf("%d", tmp);
                break;
            }
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);
        findNum(userIn.nextInt(), userIn.nextInt());
    }
}