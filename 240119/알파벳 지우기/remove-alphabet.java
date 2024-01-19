import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String a = userIn.next();
        String b = userIn.next();

        int numA = 0;
        int numB = 0;

        for(int i = 0; i < a.length(); i++){
            int c = (int)a.charAt(i);

            if(c >= 48 && c <= 57){
                numA *= 10;
                numA += (c - 48);
            }
        }

        for(int i = 0; i < b.length(); i++){
            int c = (int)b.charAt(i);

            if(c >= 48 && c <= 57){
                numB *= 10;
                numB += (c - 48);
            }
        }

        System.out.printf("%d", numA + numB);
    }
}