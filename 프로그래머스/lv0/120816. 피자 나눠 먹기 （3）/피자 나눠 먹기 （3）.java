class Solution {
    public int solution(int slice, int n) {
        // 피자 2조각 ~ 10조각 잘라줌
        // n : 사람 수
        // slice : 피자 조각 수
        // 최소 1조각 이상 먹기위한 피자 판 수
        int answer = 0;
        /*
        사람명 % slice 하면 0이 아니면 몫 +1 
        */
        
        if(n%slice == 0){
            answer = n/slice;
        }
        else{
            answer = n/slice + 1;
        }
        return answer;
    }
}