import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int idx = -1;

        String str = userIn.next();
        char target = userIn.next().charAt(0);

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            System.out.printf("%s", "No");
        }
        else{
            System.out.printf("%d", idx);
        }
    }
}