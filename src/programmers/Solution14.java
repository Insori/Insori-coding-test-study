package programmers;

import java.util.Scanner;

public class Solution14 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            if(n%i==0)
                answer+=i;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Solution14 s = new Solution14();
        System.out.print(s.solution(scan.nextInt()));
    }
}