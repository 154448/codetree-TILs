import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String a = userIn.next();
        String b = userIn.next();

        if((a + b).equals(b + a)){
            System.out.printf("true");
        }
        else{
            System.out.printf("false");
        }
    }
}