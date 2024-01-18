import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String a = userIn.next();
        String b = userIn.next();

        int idx = 0;
        int i = 0;

        while(i < a.length()){
            char current = a.charAt(i);

            if(current == b.charAt(idx)){
                idx += 1;

                if(idx == b.length()){
                    a = a.substring(0, i - b.length() + 1) + a.substring(i + 1);
                    idx = 0;
                    i = -1;
                }
            }
            i += 1;
        }

        System.out.printf("%s", a);
    }
}