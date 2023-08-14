class Solution {
    public String solution(String my_string, int k) {
        int len = my_string.length();
        String answer = "";
        for(int i=0; i<k; i++){
            for(int j=0; j<len; j++){
                answer += my_string.charAt(j);
            }
        }
        return answer;
    }
}