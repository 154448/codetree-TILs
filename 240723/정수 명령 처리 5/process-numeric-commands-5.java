import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<>();

        int k = userIn.nextInt();

        for(int i = 0; i < k; i++){
            String command = userIn.next();

            if(command.equals("size")){
                System.out.printf("%d\n", num.size());
            }
            else if(command.equals("pop_back")){
                int idx = num.size() - 1;
                int n = num.get(idx);
                num.remove(idx);
            }
            else if(command.equals("push_back")){
                int n = userIn.nextInt();
                num.add(n);
            }
            else{
                int n = num.get(userIn.nextInt() - 1);
                System.out.printf("%d\n", n);
            }
        }
    }
}