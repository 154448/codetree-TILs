import java.util.Scanner;

class Student{
    String code;
    int score;

    public Student(String userCode, int userScore){
        this.code = userCode;
        this.score = userScore;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        Student[] students = new Student[5];

        for(int i = 0; i < 5; i++){
            String userCode = userIn.next();
            int userScore = userIn.nextInt();

            students[i] = new Student(userCode, userScore);
        }

        String minStudent = "";
        int minScore = 101;

        for(int i = 0; i < 5; i++){
            if(minScore > students[i].score){
                minScore = students[i].score;
                minStudent = students[i].code;
            }
        }

        System.out.printf("%s %d", minStudent, minScore);
    }
}