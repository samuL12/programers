class Solution {
    public String solution(String my_string) {
        String answer = "";
        int len_str = my_string.length();
        for(int i=1; i<len_str+1; i++){
            answer += my_string.charAt(len_str-i);
        }
        return answer;
    }
}