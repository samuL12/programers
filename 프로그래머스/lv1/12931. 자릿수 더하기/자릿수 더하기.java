import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = 1;
        while(n>=temp){
            answer += (int)(n/temp%10);
            temp *= 10;
        }
        return answer;
    }
}