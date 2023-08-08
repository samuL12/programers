class Solution {
    public int solution(String my_string) {
        // '0' - '9' -> 48 - 57 
        int answer = 0;
        int temp = 0;
        for(int i=0; i<my_string.length(); i++){
            temp = (int) my_string.charAt(i);
            if(48 <= temp && temp <=57){
                answer += temp-48;
            }
        }
        return answer;
    }
}