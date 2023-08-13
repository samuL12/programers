class Solution {
    public String solution(String myString) {
        char temp = ' ';
        String answer = "";
        for(int i=0;i<myString.length();i++){
            temp = myString.charAt(i);
            if(temp>=97 && temp<=122){
                temp = (char)(temp - 32);
            }
            answer += temp;
        }
        return answer;
    }
}