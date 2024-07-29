import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        LinkedList<Integer> linkedList = new LinkedList<>();

        int n = userIn.nextInt();

        for(int i = 0; i < n; i++){
            String command = userIn.next();

            if(command.equals("push_front")){
                int num = userIn.nextInt();

                linkedList.addFirst(num);
            }

            else if(command.equals("push_back")){
                int num = userIn.nextInt();

                linkedList.addLast(num);
            }

            else if(command.equals("pop_front")){
                System.out.printf("%d\n", linkedList.pollFirst());

            }
            else if(command.equals("pop_back")){
                System.out.printf("%d\n", linkedList.pollLast());
            }
            else if(command.equals("size")){
                System.out.printf("%d\n", linkedList.size());
            }
            else if(command.equals("empty")){
                System.out.printf("%d \n", linkedList.isEmpty()? 1 : 0);
            }
            else if(command.equals("front")){
                System.out.printf("%d\n", linkedList.peekFirst());
            }
            else if(command.equals("back")){
                System.out.printf("%d\n", linkedList.peekLast());
            }
        }


    }
}