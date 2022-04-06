package programmers;
import java.util.Scanner;

public class Solution9 {
    public String[] solution(int n) {
        String[] answer = new String[n];
        for(int i=1; i<=n; i++) {
            if(i%2==1)
                answer[i-1]="수";
            else
                answer[i-1]="박";
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Solution9 s=new Solution9();
        String[] str=s.solution(scan.nextInt()); //문자열 길이
        for(int i=0; i<str.length; i++) {
            System.out.print(str[i]);
        }

    }
}