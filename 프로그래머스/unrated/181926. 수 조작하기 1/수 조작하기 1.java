class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char temp = ' ';
        for(int i=0; i<control.length(); i++){
            temp = control.charAt(i);
            if('w' == temp){
                answer++;
            }
            else if('s' == temp){
                answer--;
            }
            else if('d' == temp){
                answer+=10;
            }
            else if('a' == temp){
                answer-=10;
            }
        }
        return answer;
    }
}