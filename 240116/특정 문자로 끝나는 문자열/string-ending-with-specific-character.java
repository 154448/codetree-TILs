import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String[] word = new String[10];

        for(int i = 0; i < 10; i++){
            word[i] = userIn.next();
        }

        int cnt = 0;
        char target = userIn.next().charAt(0);

        for(int i = 0; i < 10; i++){
            String str = word[i];

            if(str.charAt(str.length() - 1) == target){
                cnt += 1;
                System.out.printf("%s\n", str);
            }
        }

        if(cnt == 0){
            System.out.println("None");
        }
    }
}