import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        char[] str = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};

        char target = userIn.next().charAt(0);

        int loc = -1;

        for(int i = 0; i < 6; i++){
            if(str[i] == target){
                loc = i;
            }
        }

        System.out.println(loc == -1 ? "None" : loc);
    }
}