import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.nextLine();

        int cnt = 0;
        int n = str.length();

        for(int i = 1; i < n - 3; i++){
            if((str.charAt(i - 1) == '(') && (str.charAt(i) == '(')){
                for(int j = i + 1; j < n - 1; j++){
                    if((str.charAt(j) == ')') && str.charAt(j + 1) == ')'){
                        cnt += 1;
                    }
                }
            }
        }
        System.out.printf("%d", cnt);
    }
}