import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String answer = "";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= 65 && str.charAt(i) <=90){
                answer += (char)(str.charAt(i)+32);
            }
            else if(str.charAt(i) >= 97 && str.charAt(i) <=122){
                answer += (char)(str.charAt(i) - 32);
            }
        }
        System.out.println(answer);
    }
}