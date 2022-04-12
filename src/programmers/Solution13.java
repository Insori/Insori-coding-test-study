package programmers;
import java.util.Scanner;

public class Solution13 {
    public boolean solution(int x) {
        boolean answer;
        int n = x;
        int sum = 0;
        while(true) {
            sum+=(n%10);
            n=n/10;
            if(n<10) {
                sum+=n;
                break;
            }
        }
        if(x%sum==0)
            answer = true;
        else
            answer =  false;

        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Solution13 s = new Solution13();
        System.out.print(s.solution(scan.nextInt()));
    }
}