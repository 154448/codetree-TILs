import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int start = userIn.nextInt();
        int end = userIn.nextInt();

        int result = 0;

        for(int i = start; i <= end; i++){
            String num = Integer.toString(i);

            boolean isRight = true;

            for(int j = 0; j < (num.length() / 2); j++){
                if(num.charAt(j) != num.charAt(num.length() - 1 - j)){
                    isRight = false;
                    break;
                }
            }

            if(isRight){
                result++;
            }
        }

        System.out.printf("%d", result);
    }
}