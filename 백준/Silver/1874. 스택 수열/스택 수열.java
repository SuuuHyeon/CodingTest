import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 수열 숫자 갯수
        int[] numArr = new int[n];

        boolean result = true;

        // 수열 생성
        for (int i = 0; i < n; i++) {
            numArr[i] = Integer.parseInt(br.readLine()); // 차례대로 배열에 값 저장
        }

        int number = 1;
        Stack<Integer> stack = new Stack<>();
        StringBuffer sf = new StringBuffer();

        for (int i = 0; i < numArr.length; i++) {
            if (number <= numArr[i]) {
                while (number <= numArr[i]) {
                    stack.push(number++);
                    sf.append("+\n");
                }
                stack.pop();
                sf.append("-\n");
            } else {
                int num = stack.pop();
                if (num > numArr[i]) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    sf.append("-\n");
                }
            }
        }
        if (result) System.out.println(sf);
    }
}