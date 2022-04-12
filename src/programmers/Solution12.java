package programmers;
import java.util.Scanner;

public class Solution12 {
    public int[] solution(long n) {
        int[] answer={};
        int cnt=0;
        long o=n;
        while(o>10) {
            o=(o/10);
            cnt++;
        }
        answer = new int[cnt+1];
        for(int i=0; i<answer.length; i++) {
            answer[i]=(n<10) ? (int)n:(int)(n%10);
            n=n/10;
        }

        return answer;
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        Solution12 s = new Solution12();
        Long n = scan.nextLong();
        for(int i=0; i<s.solution(n).length; i++) {
            System.out.print(s.solution(n)[i]+" ");
        }
    }
}