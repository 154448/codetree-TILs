import java.util.Scanner;

public class Main {
    public static int sumPlaceValue(int n){
        if(n / 10 == 0){
            return (int)Math.pow(n % 10, 2);
        }
        else{
            return (int)Math.pow(n % 10, 2) + sumPlaceValue(n / 10);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        System.out.printf("%d", sumPlaceValue(n));
    }
}