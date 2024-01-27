import java.util.Scanner;

class BombRelease{
    String releaseCode;
    String cutColor;
    int second;

    public BombRelease(String code, String color, int time){
        this.releaseCode = code;
        this.cutColor = color;
        this.second = time;
    }
}


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String code = userIn.next();
        String color = userIn.next();
        int time = userIn.nextInt();

        BombRelease info = new BombRelease(code, color, time);

        System.out.printf("code : %s\n", info.releaseCode);
        System.out.printf("color : %s\n", info.cutColor);
        System.out.printf("second : %d", info.second);

    }
}