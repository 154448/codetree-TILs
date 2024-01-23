import java.util.Scanner;

public class Main {
    public static String isRight(String str){
        int cnt = 0;

        int[] isExit = new int [26];

        for(int i = 0; i < str.length(); i++){
            int intChar = (int)str.charAt(i);

            isExit[intChar % 97] += 1;

            if(isExit[intChar % 97] == 1){
                cnt += 1;
            }
        }

        return cnt >= 2 ? "Yes" : "No";
    }

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        String str = userIn.next();

        System.out.printf("%s", isRight(str));


    }
}