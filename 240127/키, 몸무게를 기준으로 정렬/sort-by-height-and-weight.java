import java.util.Scanner;
import java.util.Arrays;

class Person implements Comparable<Person>{
    String name;
    int height;
    int weight;

    public Person(String wildInfo){
        String[] info = wildInfo.split(" ");

        this.name = info[0];
        this.height = Integer.parseInt(info[1]);
        this.weight = Integer.parseInt(info[2]);
    }

    public int compareTo(Person other){
        if(this.height != other.height){
            return this.height - other.height;
        }
        return other.weight - this.weight;
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
            Person p = people[i];
            System.out.printf("%s %d %d\n", p.name, p.height, p.weight);
        }
    }
}