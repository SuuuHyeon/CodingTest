import java.util.Scanner;

// 연속된 자연수로 표현


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 입력받을 자연수 N

        int startIndex = 1;
        int endIndex = 1;
        int sum = 1;
        int count = 1; // 가짓수(자기자신 1개 미리 추가)

        while(endIndex != N) {
            if(sum < N) {
                endIndex++;
                sum += endIndex;
            } else if(sum == N) {
                count++;
                endIndex++;
                sum += endIndex;
            } else {
                sum -= startIndex;
                startIndex++;
            }
        }

        System.out.println(count);
    }
}