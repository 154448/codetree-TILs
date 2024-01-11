import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int q = userIn.nextInt();

        int[] num = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = userIn.nextInt();
        }

        for(int i = 0; i < q; i++){
            int opt = userIn.nextInt();
            int a = userIn.nextInt();

            if(opt == 1){
                System.out.printf("%d\n", num[a - 1]);
            }
            else if(opt == 2){
                int loc = 0;
                for(int j = 0; j < n; j++){
                    if(num[j] == a){
                        loc = j + 1;
                        break;
                    }
                }
                System.out.printf("%d\n", loc);
            }
            else{
                int b = userIn.nextInt();

                for(int j = a - 1; j < b; j++){
                    System.out.printf("%d ", num[j]);
                }
                System.out.printf("\n");
            }
        }
    }
}