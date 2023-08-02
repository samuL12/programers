class Solution {
    public int solution(int n) {
        int answer = 0; // 피자 갯수
        if(n>7){
            if(n%7 == 0)
                answer = n/7;
            else
                answer = n/7+1;
        }
        else{
            answer = 1;
        }
        
        return answer;
    }
}