import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.next();


        for(int i = 0; i < str.length(); i++){
            char current = str.charAt(i);

            if(current == 'e'){
                System.out.printf("%s", str.substring(0,i) + str.substring(i + 1));
                break;
            }
        }
    }
}