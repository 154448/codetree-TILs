import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.next();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            int n = (int)c;

            if((n >= 97 && n <= 122) || (n >= 48 && n <= 57)){
                System.out.printf("%c", c);
            }
            else if(n >= 65 && n <= 90){
                n += 32;
                System.out.printf("%c", (char)n);
            }
        }
    }
}