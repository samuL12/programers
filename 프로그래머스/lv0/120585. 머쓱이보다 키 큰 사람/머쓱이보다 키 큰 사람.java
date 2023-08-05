class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        int count = 0;
        for(int i:array){
            if(i>height)
                count++;
        }
        answer = count;
        return answer;
    }
}