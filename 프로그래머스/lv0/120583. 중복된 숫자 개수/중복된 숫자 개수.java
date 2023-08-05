class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int count = 0;
        for(int i:array){
            if(i==n)
                count++;
        }
        answer = count;
        return answer;
    }
}