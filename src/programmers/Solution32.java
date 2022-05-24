package programmers;

public class Solution32 {
    public String solution(String s) {
        String answer = "";
        String[] s_word = s.split("");
        int index=0;
        for(int i=0; i<s_word.length; i++) {
            if(s_word[i].equals(" "))
                index=0;
            else {
                if(index%2==0) {
                    s_word[i]=s_word[i].toUpperCase();
                    index++;
                }
                else if(index%2!=0) {
                    s_word[i]=s_word[i].toLowerCase();
                    index++;
                }
            }
            answer+=s_word[i];
        }
        return answer;
    }
}