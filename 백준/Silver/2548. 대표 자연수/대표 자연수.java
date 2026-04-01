import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 자연수 개수
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        String input = br.readLine();
        String[] inputArr = input.split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        int[] sumArr = new int[N];
        int minIndex = 0;
        int min = Integer.MAX_VALUE;
        List<Integer> minIndexList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = N - 1; j >= 0; j--) {
                int temp = arr[j] - arr[i] >= 0 ? arr[j] - arr[i] : -1 * (arr[j] - arr[i]);
                sumArr[i] += temp;
            }
            // 최솟값 가지는 인덱스 찾기
            if (sumArr[i] < min) {
                minIndex = i; // 최솟값의 인덱스 찾기
                min = sumArr[i]; // 최솟값
            }
        }

        for (int i = 0; i < sumArr.length; i++) {
            if (sumArr[i] == min) {
                minIndexList.add(i);
            }
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < minIndexList.size(); i++) {
            if (arr[minIndexList.get(i)] < answer) {
                answer = arr[minIndexList.get(i)];
            }
        }

        System.out.println(answer);
    }
}
