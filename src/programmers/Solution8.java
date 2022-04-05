package programmers;
import java.util.Scanner;

public class Solution8 {
    public int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Solution8 sol = new Solution8();
        String s=scan.next();
        System.out.print(sol.solution(s));
    }
}
