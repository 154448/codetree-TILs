import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        char[] tempArr = new char[10];

        for(int i = 9; i >= 0; i--){
            char temp = userIn.next().charAt(0);
            tempArr[i] = temp;
        }

        for(int i = 0; i < 10; i++){
            System.out.printf("%c", tempArr[i]);
        }
    }
}