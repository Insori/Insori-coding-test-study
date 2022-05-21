package programmers;

public class Solution30 {
    public String solution(String s, int n) {
        String answer = "";
        char ch;
        for(int i=0; i<s.length(); i++) {
            ch = s.charAt(i);
            if(ch==' ') answer+=' ';
            else if(ch>='a' && ch<='z') {
                if(ch+n>'z') answer+=(char)(ch+n-26);
                else answer+=(char)(ch+n);
            }
            else if(ch>='A' && ch<='Z') {
                if(ch+n>'Z') answer+=(char)(ch+n-26);
                else answer+=(char)(ch+n);
            }
        }
        return answer;
    }
}