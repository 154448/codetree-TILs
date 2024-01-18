import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.next();

        String newStr = "";
        newStr += str.charAt(1);
        newStr += str.charAt(0);

        for(int i = 2; i < str.length(); i++){
            char current = str.charAt(i);

            if(current == newStr.charAt(0)){
                current = newStr.charAt(1);
            }
            else if(current == newStr.charAt(1)){
                current = newStr.charAt(0);
            }
            newStr += current;
        }

        System.out.printf("%s", newStr);


    }
}