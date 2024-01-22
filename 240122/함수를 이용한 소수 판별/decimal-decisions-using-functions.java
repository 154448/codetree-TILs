import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n){
        boolean res = true;

        if(n == 1){
            return false;
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
        Scanner userIn = new Scanner(System.in);

        int a = userIn.nextInt();
        int b = userIn.nextInt();

        int sum = 0;

        for(int i = a; i <= b; i++){
            sum += isPrime(i) ? i : 0;
        }

        System.out.printf("%d", sum);


    }
}