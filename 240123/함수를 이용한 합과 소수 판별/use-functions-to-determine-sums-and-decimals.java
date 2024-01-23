import java.util.Scanner;

public class Main {
    public static int countPrimeNum(int a, int b){
        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(isPrimeNum(i)){
                if(((i % 10) + (i / 10)) % 2 == 0){
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static boolean isPrimeNum(int n){
        boolean res = true;

        if(n == 1){
            res = false;
        }

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                res = false;
                break;
            }
        }

        return res;
    }


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int a = userIn.nextInt();
        int b = userIn.nextInt();

        System.out.printf("%d", countPrimeNum(a, b));
    }
}