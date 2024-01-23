import java.util.Scanner;

public class Main {
    public static boolean isLeafYear(int y){
        boolean res = false;
        
        //4의 배수인 경우
        if(y % 4 == 0){
            if(y % 100 == 0){
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

        if(m % 8 == 0){
            if(m % 2 == 1){
                res = d <= 31 ? true : false;
            }
            else{
                if(m == 2){
                    int feb = isLeafYear(y)? 29 : 28;
                    res = d <= feb ? true : false;
                }
                else{
                    res = d <= 30 ? true : false;
                }
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
        String res = "-1";

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

        return res;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int y = userIn.nextInt();
        int m = userIn.nextInt();
        int d = userIn.nextInt();

        System.out.printf("%s", judgeSeason(y, m, d));
    }
}