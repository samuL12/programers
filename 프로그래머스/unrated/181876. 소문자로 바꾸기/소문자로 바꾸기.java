class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            if((int)myString.charAt(i)>=65 && (int)myString.charAt(i)<=90){
                answer += (char)((int)myString.charAt(i)+32);
            }
            else{
                answer += myString.charAt(i);
            }
        }
        return answer;
    }
}