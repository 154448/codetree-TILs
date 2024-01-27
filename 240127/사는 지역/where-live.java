import java.util.Scanner;
import java.util.Arrays;

class Person{
    String name;
    String address;
    String location;

    public Person(String name, String addr, String loc){
        this.name = name;
        this.address = addr;
        this.location = loc;
    }

    public String getName(){
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        Person[] people = new Person[n];

        for(int i = 0; i < n; i++){
            String userName = userIn.next();
            String addr = userIn.next();
            String loc = userIn.next();

            people[i] = new Person(userName, addr, loc);
        }

        Arrays.sort(people,(p1, p2) -> {
            return p1.getName().compareTo(p2.getName());
        });

        Person target = people[n - 1];

        System.out.printf("name %s\n", target.name);
        System.out.printf("addr %s\n", target.address);
        System.out.printf("city %s", target.location);
    }
}