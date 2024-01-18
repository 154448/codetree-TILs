import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);
        
        String str = userIn.next();
        String newStr = "";

        newStr += str.substring(0, 1);
        newStr += str.substring(2, str.length() - 2);
        newStr += str.substring(str.length()-1);

        System.out.printf("%s", newStr);
    }
}