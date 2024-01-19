import java.util.Scanner;

public class Main {
    public static void findNum(int n, int m){
        int s = n > m ? m : n;
        int b = n > m ? n : m;

        int answer = 0;

        for(int i = 1; i <= s; i++){
            if(s % i == 0 && b % i == 0){
                answer = i;
            }
        }

        System.out.printf("%d", answer);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        findNum(userIn.nextInt(), userIn.nextInt());
    }
}