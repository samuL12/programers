class Solution {
    public int solution(int n) {
        int answer = 0;
        int l = 0;
        l = n/2; // 등차 항 갯수
        if(l == 0){
            answer = 0;
        }
        else if(n == 1){
            answer = 2;
        }
        else{
            if(n%2 == 1){
                n += -1;
            }
            answer = (l*(2 + n))/2;
        }
        return answer;
    }
}