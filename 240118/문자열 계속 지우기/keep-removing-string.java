import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        //a - 전체 문자열
        String a = userIn.next();
        //b - 부분 문자열
        String b = userIn.next();
        //b 탐색 시, 사용하는 idx
        int idx = 0;
        
        //a 탐색시 사용하는 i
        int i = 0;
        while(i < a.length()){
            //현재 위치의 글자
            char current = a.charAt(i);
            //동일할 경우
            if(current == b.charAt(idx)){
                idx += 1;

                //완전히 일치하는 경우를 찾은 경우
                if(idx == b.length()){
                    //문자열을 자름
                    a = a.substring(0, i - b.length() + 1) + a.substring(i + 1);
                    //위치 초기화
                    idx = 0;
                    //문자열을 처음부터 다시 검색
                    i = -1;
                }
            }
            //다른 경우
            else{
                //idx를 초기화
                i = i - idx;
                idx = 0;
            }

            i += 1;
            //System.out.printf("%d %d\n", i, idx);
        }

        System.out.printf("%s", a);
    }
}