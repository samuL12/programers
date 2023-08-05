class Solution {
    public int solution(int[] numbers) {
        int max1 = 0; //첫번째로 큰 수
        int max2 = 0; //두번째로 큰 수
        int answer = 0;
        for(int i:numbers){
            if(max2 < i){
                if(max1 < i){
                    max2 = max1;
                    max1 = i;
                }
                else{
                    max2 = i;
                }
            }
        }
        answer = max1 * max2;
        return answer;
    }
}