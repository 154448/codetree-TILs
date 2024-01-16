import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String[] str = {"apple", "banana", "grape", "blueberry", "orange"};
        char target = userIn.next().charAt(0);

        int cnt = 0;

        for(int i = 0; i < 5; i++){
            if(str[i].charAt(2) == target || str[i].charAt(3) == target){
                cnt += 1;
                System.out.printf("%s\n", str[i]);
            }
        }

        System.out.printf("%d", cnt);


    }
}