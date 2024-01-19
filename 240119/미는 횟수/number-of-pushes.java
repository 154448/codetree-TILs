import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String start = userIn.next();
        String answer = userIn.next();

        int cnt = 0;

        while(true){
            cnt += 1;
            start = start.substring(1) + start.charAt(0);

            if(start.equals(answer)){
                break;
            }
        }

        System.out.printf("%d", cnt);
    }
}