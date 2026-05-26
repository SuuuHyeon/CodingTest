import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        // 정답을 차곡차곡 담아둘 StringBuilder 생성
        StringBuilder sb = new StringBuilder();
        
        // 1. 입력받은 문자열을 글자(char) 단위로 하나씩 쪼개서 반복문 돌리기
        for (char c : a.toCharArray()) {
            
            // 2. 만약 현재 글자가 대문자라면? -> 소문자로 바꿔서 추가
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } 
            // 3. 만약 현재 글자가 소문자라면? -> 대문자로 바꿔서 추가
            else {
                sb.append(Character.toUpperCase(c));
            }
        }
        
        // 4. 완성된 문자열 출력!
        System.out.println(sb.toString());
    }
}