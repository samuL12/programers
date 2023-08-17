class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int sum_square = 0;
        int answer = 0;
        for(int i:num_list){
            sum_square += i;
            mul *= i;
        }
        sum_square *= sum_square;
        if(mul > sum_square){
            answer = 0;
        }
        else{
            answer = 1;
        }
        return answer;
    }
}