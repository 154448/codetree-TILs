import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.nextLine();
        char target = userIn.next().charAt(0);

        char[] chars = str.toCharArray();

        int cnt = 0;

        for(int i = 0; i < str.length(); i++){
            if(chars[i] == target){
                cnt += 1;
            }
        }

        System.out.printf("%d", cnt);
    }
}