import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] students = new String[N];

        // 학생 번호
        for (int i = 0; i < N; i++) {
            students[i] = sc.next();
        }

        // 번호 길이
        int len = students[0].length();

        // 자를 길이(k)를 1부터 전체 길이까지 1씩 늘려가며 탐색
        for (int k = 1; k <= len; k++) {
            HashSet<String> set = new HashSet<>();
            
            for (int i = 0; i < N; i++) {
                // len - k 부터 끝까지 잘라냄
                String cutStr = students[i].substring(len - k);
                set.add(cutStr);
            }
            
            // set이랑 학생 수랑 같으면 답
            if (set.size() == N) {
                System.out.println(k);
                break;
            }
        }
    }
}