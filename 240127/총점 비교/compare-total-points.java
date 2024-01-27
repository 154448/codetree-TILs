import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{
    String name;
    int firstScore;
    int secondScore;
    int thirdScore;
    int totalScore;

    public Student(String info){
        String[] splitInfo = info.split(" ");

        this.name = splitInfo[0];
        this.firstScore =Integer.parseInt(splitInfo[1]);
        this.secondScore = Integer.parseInt(splitInfo[2]);
        this.thirdScore = Integer.parseInt(splitInfo[3]);
        this.totalScore = this.firstScore + this.secondScore + this.thirdScore;
    }

    @Override
    public int compareTo(Student other){
        return this.totalScore - other.totalScore;
    }

}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        userIn.nextLine();

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
            students[i] = new Student(userIn.nextLine());
        }

        Arrays.sort(students);

        for(int i = 0; i < n; i++){
            System.out.printf("%s %d %d %d\n", students[i].name, students[i].firstScore, students[i].secondScore, students[i].thirdScore );
        }
    }
}