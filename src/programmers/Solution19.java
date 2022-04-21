package programmers;
import java.util.Scanner;

public class Solution19 {
    public String solution(String[] seoul) {
        String answer = "";
        String str="Kim";
        for(int i=0; i<seoul.length; i++) {
            if(str.equals(seoul[i])) {
                answer="김서방은 "+i+"에 있다";
                break;
            }
            else
                continue;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Solution19 s = new Solution19();
        int len=scan.nextInt(); //배열 길이
        String[] seoul = new String[len];
        for(int i=0; i<len; i++) {
            seoul[i]=scan.next();
        }
        System.out.print(s.solution(seoul));
    }
}
