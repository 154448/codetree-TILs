import java.util.Scanner;

public class Main {
    public static int calculate(int a, int b, char o){
        int res = 0;

        if(o == '+'){
            res = a + b;
        }
        else if(o == '-'){
            res = a - b;
        }
        else if(o == '*'){
            res = a * b;
        }
        else if(o == '/'){
            res = a / b;
        }

        else{
            res = 400;
        }

        return res;

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int a = userIn.nextInt();
        char o = userIn.next().charAt(0);
        int b = userIn.nextInt();

        int res = calculate(a, b, o);

        if(res == 400){
            System.out.printf("%s", "False");
        }
        else{
            System.out.printf("%d %c %d = ", a, o, b);
            System.out.printf("%d", res);
        }

        


    }
}