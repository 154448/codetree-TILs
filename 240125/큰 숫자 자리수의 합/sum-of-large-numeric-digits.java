import java.util.Scanner;

public class Main {
    public static int addDigit(int n){
        if(n / 10 == 0){
            return n % 10;
        }
        else{
            return n % 10 + addDigit(n / 10);
        }
        
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int sum = 1;

        for(int i = 0; i < 3; i++){
            sum *= userIn.nextInt();
        }

        System.out.printf("%d", addDigit(sum));
    }
}