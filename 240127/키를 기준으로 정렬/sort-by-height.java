import java.util.Scanner;
import java.util.Arrays;

class Person implements Comparable<Person>{
    String name;
    int height;
    int weight;

    public Person(String info){
        String[] userInfo = info.split(" ");

        this.name = userInfo[0];
        this.height = Integer.parseInt(userInfo[1]);
        this.weight = Integer.parseInt(userInfo[2]);
    }

    @Override
    public int compareTo(Person other){

        return this.height - other.height;

    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        userIn.nextLine();

        Person[] people = new Person[n];

        for(int i = 0; i < n; i++){
            people[i] = new Person(userIn.nextLine());
        }

        Arrays.sort(people);

        for(int i = 0; i < n; i++){
            System.out.printf("%s %d %d\n", people[i].name, people[i].height, people[i].weight);
        }
    }
}