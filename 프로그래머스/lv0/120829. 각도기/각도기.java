class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(angle <= 90){
            angle = angle - 90;
            if(angle < 0)
                answer = 1;
            else if(angle==0)
                answer = 2;
        }else{
            angle = angle - 180;
            if(angle < 0)
                answer = 3;
            else if(angle == 0)
                answer =4;
        }
        return answer;
    }
}