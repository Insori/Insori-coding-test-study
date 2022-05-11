package programmers;

public class Solution23 {
    public int solution(String s) {
        String[] eng_word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] su = {"0","1","2","3","4","5","6","7","8","9"};

        for(int i=0; i<=9; i++) {
            s=s.replace(eng_word[i],su[i]);
        }

        int answer = Integer.parseInt(s);

        return answer;
    }
}