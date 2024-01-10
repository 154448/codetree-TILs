import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        char[] string = new char[10];

        for(int i = 0; i < 10; i++){
            string[i] = userIn.next().charAt(0);
        }

        System.out.printf("%c %c %c", string[1], string[4], string[7]);
    }
}