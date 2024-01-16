import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str1 = userIn.next();
        String str2 = userIn.next();

        if(str1.length() > str2.length()){
            System.out.printf("%s %d", str1, str1.length());
        }
        else if(str2.length() > str1.length()){
            System.out.printf("%s %d", str2, str2.length());
        }
        else{
            System.out.print("same");
        }
    }
}