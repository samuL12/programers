class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int len = my_string.length();
        while(n>0){
            answer += my_string.charAt(len-n);
            n--;
        }
        return answer;
    }
}