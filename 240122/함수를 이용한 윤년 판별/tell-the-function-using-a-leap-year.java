import java.util.Scanner;

public class Main {
    public static boolean isRight(int y){
        boolean res = false;
        
        if(y % 4 == 0){
            if(y % 100 == 0){
                if(y % 400 == 0){
                    //4의 배수 & 400의 배수 - 윤년
                    res = true;
                }
                else{
                    //4의 배수이지만, 400의 배수가 아님 - 윤년 아님
                    res = false;
                }
            }
            else{
                //4의 배수 이지만 100의 배수는 아님 - 윤년 아님
                res = true;
            }

        }
        return res;

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int year = userIn.nextInt();

        System.out.printf("%b", isRight(year));
    }
}