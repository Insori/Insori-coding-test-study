package programmers;
import java.util.Scanner;

public class Solution10 {
    public int solution(int n) {
        int answer = 0;
        while(true) {
            answer+=n%10;
            if(n<10)
                break;
            n/=10;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Solution10 s=new Solution10();
        int n=scan.nextInt();
        System.out.print(s.solution(n));
    }
}
