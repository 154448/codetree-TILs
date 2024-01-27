import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int math;

    public Student(String info){
        String[] splitInfo = info.split(" ");

        this.name = splitInfo[0];
        this.kor = Integer.parseInt(splitInfo[1]);
        this.eng = Integer.parseInt(splitInfo[2]);
        this.math = Integer.parseInt(splitInfo[3]);
    }

    @Override
    public int compareTo(Student other){
        if(this.kor != other.kor){
            return other.kor- this.kor;
        }
        else if(this.eng != other.eng){
            return other.eng - this.eng;
        }
        return other.math - this.math;
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
            System.out.printf("%s %d %d %d\n", students[i].name, students[i].kor, students[i].eng, students[i].math);
        }   
    }
}