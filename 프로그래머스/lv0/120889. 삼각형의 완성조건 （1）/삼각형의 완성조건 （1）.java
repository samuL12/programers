class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int maxIdx = 0;
        int sum = 0;
        for(int i = 1; i<3; i++){
            if(max < sides[i]){
                max = sides[i];
                maxIdx = i;
            }
        }
        for(int i=0;i<3; i++){
            if(maxIdx != i){
                sum += sides[i];
            }
        }
        // 삼각형 가능 1
        if(max < sum)
            answer = 1;
        // 삼각형 불가능 2
        else
            answer = 2;
        return answer;
    }
}