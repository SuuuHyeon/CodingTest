import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 버퍼 리더 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 스트링토크나이저 생성
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        // 받을 숫자의 수 N
        int numCount = Integer.parseInt(stringTokenizer.nextToken());
        // 계산 횟수 M
        int calcCount = Integer.parseInt(stringTokenizer.nextToken());

        // 합 배열 생성
        long[] sumArr = new long[numCount + 1]; // 인덱스 제어 쉽게 하기 위해 1 늘려서

        stringTokenizer = new StringTokenizer(br.readLine());

        // i 1부터 시작
        for (int i = 1; i <= numCount; i++) {
            sumArr[i] = sumArr[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int j = 0; j < calcCount; j++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(stringTokenizer.nextToken());
            int endIndex = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(sumArr[endIndex] - sumArr[startIndex - 1]);
        }
    }
}