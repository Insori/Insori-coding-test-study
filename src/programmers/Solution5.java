package programmers;

public class Solution5 {
    public long solution(long n) {
        long answer=0;
        if(Math.sqrt(n)-(int)Math.sqrt(n)==0.0)
            answer=((long)Math.sqrt(n)+1)*((long)Math.sqrt(n)+1);
        else
            answer=-1;
        return answer;
    }

    public static void main(String[] args) {
        Solution5 s=new Solution5();
        System.out.println(s.solution(121));
        System.out.println(s.solution(3));
    }
}
