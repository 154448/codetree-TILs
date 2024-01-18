import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        String str = "";

        for(int i = 0; i < n; i++){
            str += userIn.next();
        }

        int cnt = 0;

        for(int i = 0; i< (double)str.length()/5; i++){
            for(int j = 0; j < 5; j++){
                System.out.printf("%c", str.charAt(cnt++));
                if(cnt == str.length()){
                    break;
                }
            }
            System.out.println();
        }
    }
}