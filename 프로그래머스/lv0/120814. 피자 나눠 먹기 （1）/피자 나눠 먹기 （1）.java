class Solution {
    public int solution(int n) {
        int answer = 0; // 피자 갯수
        if(n>7){
            // 피자 갯수 딱 맞아 떨어질 때
            if(n%7 == 0)
                answer = n/7;
            // 피자 조각 1개에서 6조각 부족할 때
            else
                answer = n/7+1;
        }
        // 사람 7명 미만
        else{
            answer = 1;
        }
        
        return answer;
    }
}