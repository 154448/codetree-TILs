import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        userIn.nextLine();

        String str = userIn.nextLine();

        int cnt = 0;

        for(int i = 0; i < n - 2; i++){
            if(str.charAt(i) == 'C'){
                for(int j = i + 1; j < n - 1; j++){
                    if(str.charAt(j) == 'O'){
                        for(int k = j + 1; k < n; k++){
                            if(str.charAt(k) == 'W'){
                                cnt += 1;
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("%d", cnt);
    }
}