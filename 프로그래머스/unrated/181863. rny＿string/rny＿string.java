class Solution {
    public String solution(String rny_string) {
        String answer = "";
        int len = rny_string.length();
        char temp = ' ';
        for(int i=0; i<len; i++){
            temp = rny_string.charAt(i);
            if('m' == temp){
                answer += 'r';
                answer += 'n';
            }
            else{
                answer += temp;
            }
        }
        return answer;
    }
}