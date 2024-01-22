import java.util.Scanner;

public class Main {
    public static String isMagicNum(int n){
        int numSum = n / 10 + n % 10;
        if(n % 2 == 0 && numSum % 5 == 0){
            return "Yes";
        }
        else{
            return "No";
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        System.out.printf("%s", isMagicNum(userIn.nextInt()));
    }
}