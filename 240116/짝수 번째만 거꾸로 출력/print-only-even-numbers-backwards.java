import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.next();


        for(int i = str.length() - 1; i >= 0; i--){
            if(i % 2 == 1){
                System.out.printf("%c", str.charAt(i));
            }
        }
    }
}