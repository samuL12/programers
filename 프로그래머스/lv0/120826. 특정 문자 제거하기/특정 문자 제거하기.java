class Solution {
    public String solution(String my_string, String letter) {
        // letter.length() is 1 
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(letter.charAt(0) != my_string.charAt(i)){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}