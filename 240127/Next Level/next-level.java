import java.util.Scanner;

class User{
    String id;
    int level;

    public User(String userId, int userLevel){
        this.id = userId;
        this.level = userLevel;
    }

    public User(){
        this.id = "codetree";
        this.level = 10;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        String userId = userIn.next();
        int userLevel = userIn.nextInt();

        User user1 = new User();
        User user2 = new User(userId, userLevel);

        System.out.printf("user %s lv %d\n", user1.id, user1.level);

        System.out.printf("user %s lv %d", user2.id, user2.level);
    }
}