import java.util.Scanner;

public class Main {
    public static boolean isLeafYear(int y){
        boolean res = false;
        //4의 배수인 경우
        if(y % 4 == 0){
            if(y % 100 == 0){
                //100의 배수인 경우 false but 400의 배수인 경우 true
                res = (y % 400 == 0) ? true : false;
            }
            else{
                //4의 배수 & 100의 배수가 아님 - 윤년
                res = true;
            }
        }

        return res;
    }

    public static boolean isDate(int y, int m, int d){
        boolean res = false;

        if(m / 8 == 0){
            if(m % 2 == 1){
                res = d <= 31 ? true : false;
            }
            else{
                int key = (m == 2)? (isLeafYear(y)? 29 : 28) : 30;
                res = d <= key ? true : false;
            }
        }
        else{
            if(m % 2 == 0){
                res = d <= 31 ? true : false;
            }
            else{
                res = d <= 30 ? true : false;
            }
        }

        return res;

    }
    public static String judgeSeason(int y, int m, int d){
        String res = "";

        if(isDate(y, m, d)){
            if(m >= 3 && m <= 5){
                res = "Spring";
            }
            else if(m >= 6 && m <= 8){
                res = "Summer";
            }
            else if(m >= 9 && m <= 11){
                res = "Fall";
            }
            else{
                res = "Winter";
            }

        }
        else{
            res = "-1";
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int y = userIn.nextInt();
        int m = userIn.nextInt();
        int d = userIn.nextInt();

        System.out.printf("%s", judgeSeason(y, m, d));
    }
}