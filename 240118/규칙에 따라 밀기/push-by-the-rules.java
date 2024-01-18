import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.next();
        String command = userIn.next();

        for(int i = 0; i < command.length(); i++){
            char c = command.charAt(i);

            String newStr = "";

            if(c == 'L'){
                newStr += str.substring(1) + str.charAt(0);
            }
            else if(c == 'R'){
                newStr += str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
            }

            str = newStr;
        }
        System.out.printf("%s", str);
    }
}