package programmers;
import java.util.Scanner;

public class Solution7 {
    public int solution(int n) {
        int answer = 1;
        for(int i=1; i<n; i++) {
            if(n%answer==1)
                break;
            else
                answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Solution7 s= new Solution7();
        int n=scan.nextInt();
        System.out.print(s.solution(n));

    }
}