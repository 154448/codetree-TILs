import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.next();
        int n = userIn.nextInt();


        for(int i = 1; i <= n; i++){
            int idx = str.length() - i;

            if(idx >= 0){
                System.out.printf("%c", str.charAt(idx));
            }
            else{
                break;
            }
        }
    }
}