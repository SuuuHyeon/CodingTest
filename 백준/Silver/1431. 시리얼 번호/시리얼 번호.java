import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr, (a, b) -> {
            // 1번 조건 판단
            if (a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                if (getNumSum(a) == getNumSum(b)) {
                    // 숫자 먼저 온 것 넣기
                    return a.compareTo(b);
                }
                return getNumSum(a) - getNumSum(b);
            }
        });
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            st.append(arr[i]);
            st.append('\n');
        }

        System.out.println(st);
    }

    // 숫자만 골라서 더하는 메서드
    private static int getNumSum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c =  str.charAt(i);
            // 숫자가 맞으면 더하기
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        return sum;
    }
}
