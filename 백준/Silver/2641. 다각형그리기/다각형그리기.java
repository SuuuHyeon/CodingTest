import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 표본 모양수열의 길이
        int N = Integer.parseInt(br.readLine());

        // 표본 수열 담아놓기
        int[] nArr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nArr.length; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }

        // 모양수열 개수
        int M = Integer.parseInt(br.readLine());
        // 수열 담을 배열
        int[][] mArr = new int[M][N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                mArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num: nArr) {
            sb.append(num);
        }
        String str = sb.toString(); // 원본 수열 문자열
        String strTwice = str + str;

        StringBuilder reversedSb = new StringBuilder();

        for (int i = N - 1; i >= 0; i--) {
            int dir = nArr[i];
            int revDir = 0;

            switch (dir) {
                case 1:
                    revDir = 3;
                    break;
                case 2:
                    revDir = 4;
                    break;
                case 3:
                    revDir = 1;
                    break;
                case 4:
                    revDir = 2;
                    break;
            }

            reversedSb.append(revDir);
        }
        String reversedStr = reversedSb.toString();
        String reversedStrTwice = reversedStr + reversedStr;

        int count = 0;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < M; i++) {
            StringBuilder compareSb = new StringBuilder();
            for (int j = 0; j < N; j++) {
                compareSb.append(mArr[i][j]);
            }
            String compareSbStr = compareSb.toString();

            if (strTwice.contains(compareSbStr) || reversedStrTwice.contains(compareSbStr)) {
                count++;
                for (int k = 0; k < N; k++) {
                    answer.append(mArr[i][k]).append(" ");
                }
                answer.append('\n');
            }
        }

        System.out.println(count);
        System.out.println(answer);
    }
}
