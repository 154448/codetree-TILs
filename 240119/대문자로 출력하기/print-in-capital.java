import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.nextLine();

        for(int i = 0; i < str.length(); i++){
            char tmp = str.charAt(i);

            int transfer = (int)tmp;

            //대문자 - 그대로 출력
            if(transfer >= 65 && transfer <= 90){
                System.out.printf("%c", (char)transfer);
            }
            //소문자 - 대문자로 변환해서 출력
            else if(transfer >= 97 && transfer <= 122){
                transfer -= 32;
                System.out.printf("%c", (char)transfer);
            }
            
        }
    }
}