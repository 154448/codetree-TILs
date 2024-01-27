import java.util.Scanner;

class Message{
    String secretCode;
    char meetPlace;
    int time;

    public Message(String secretCode, char meetPlace, int time){
        this.secretCode = secretCode;
        this.meetPlace = meetPlace;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String secretCode = userIn.next();
        char place = userIn.next().charAt(0);
        int time = userIn.nextInt();

        Message secretMsg = new Message(secretCode, place, time);

        System.out.printf("secret code : %s\n", secretMsg.secretCode);
        System.out.printf("meeting point : %c\n", secretMsg.meetPlace);
        System.out.printf("time : %d", secretMsg.time);

    }
}