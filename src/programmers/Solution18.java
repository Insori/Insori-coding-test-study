package programmers;
import java.util.Scanner;

public class Solution18 {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt;
        for(int i=left; i<=right; i++) {
            cnt=0;
            for(int j=1; j<=i; j++) {
                if(i%j==0)
                    cnt++;
            }
            if(cnt%2==0)
                answer+=i;
            else
                answer-=i;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Solution18 s =new Solution18();
        int left= scan.nextInt();
        int right= scan.nextInt();
        System.out.println(s.solution(left, right));

    }
}
