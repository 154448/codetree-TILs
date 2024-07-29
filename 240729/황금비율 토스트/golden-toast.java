import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        LinkedList<Character> list = new LinkedList<Character>();
        ListIterator<Character> it;

        String str = userIn.next();

        for(int i = 0; i < n; i++){
            list.add(str.charAt(i));
        }

        it = list.listIterator(list.size());

        for(int i = 0; i < m; i++){
            char command = userIn.next().charAt(0);

            if(command == 'L'){
                if(it.hasPrevious()){
                    it.previous();
                }
            }
            else if(command == 'R'){
                if(it.hasNext()){
                    it.next();
                }
            }
            else if(command == 'D'){
                it.next();
                it.remove();
            }
            else if(command == 'P'){
                char num = userIn.next().charAt(0);
                it.add(num);
            }
        }

        it = list.listIterator();

        while(it.hasNext()){
            System.out.printf("%c", it.next());
        }
    }
}