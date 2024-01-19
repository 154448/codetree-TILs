import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        String target = userIn.next();

        int cnt = 0;

        for(int i = 0; i < n; i++){
            String str = userIn.next();

            cnt += str.equals(target)? 1 : 0;
        }

        System.out.printf("%d", cnt);


    }
}