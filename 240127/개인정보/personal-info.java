import java.util.Scanner;
import java.util.Arrays;

class Person{
    String name;
    int height;
    double weight;

    public Person(String info){
        String[] splitInfo = info.split(" ");

        this.name = splitInfo[0];
        this.height = Integer.parseInt(splitInfo[1]);
        this.weight = Double.parseDouble(splitInfo[2]);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = 5;

        Person[] people = new Person[n];

        for(int i = 0; i < n; i++){
            people[i] = new Person(userIn.nextLine());
        }

        System.out.printf("%s\n", "name");

        Arrays.sort(people, (p1, p2) -> (p1.name).compareTo(p2.name));

        for(int i = 0; i < n; i++){
            Person p = people[i];
            System.out.printf("%s %d %.1f\n", p.name, p.height, p.weight);
        }

        System.out.printf("\n%s\n", "height");

        Arrays.sort(people, (p1, p2) -> p2.height - p1.height);

        for(int i = 0; i < n; i++){
            Person p = people[i];
            System.out.printf("%s %d %.1f\n", p.name, p.height, p.weight);
        }

    }
}