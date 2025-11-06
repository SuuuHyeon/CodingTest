import java.io.*;
import java.util.*;

public class Main {
    static int[] checkArr;      // 필요한 알파벳 갯수 조건을 넣을 배열
    static int[] myArr;         // checkArr과 비교할 배열
    static int checkSecret;     // 각 알파벳의 수를 채웠는지 판단하기 위해 선언
    static int result;          // 결과 값
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] SP = br.readLine().split("\\s");
        int S = Integer.parseInt(SP[0]);    // 입력받은 문자열의 길이
        int P = Integer.parseInt(SP[1]);    // 사용할 부분문자열의 길이
        char[] DNA = br.readLine().toCharArray();    // 입력받은 DNA 문자 배열
        result = 0;
        checkSecret = 0;

        // check 할 갯수들을 넣은 배열
        String[] strCheck = br.readLine().split("\\s");
        // 정수 배열로 변환
        checkArr = Arrays.stream(strCheck).mapToInt(Integer::parseInt).toArray();
        for (int i : checkArr) {
            if (i == 0) checkSecret++;
        }
        // check 배열과 비교할 배열
        myArr = new int[4];


        // 알파벳 매칭시켜서 맞으면 myArr의 해당 알파벳 갯수 증가
        for(int i = 0; i < P; i++) {
            add(DNA[i]);
        }

        if(checkSecret == 4) result++;      // checkSecret이 4면 알맞은 문자열이므로 추가

        for(int i = P; i < S; i++) {
            int j = i - P;
            add(DNA[i]);
            remove(DNA[j]);
            if(checkSecret == 4) result++;
        }

        System.out.println(result);
    }

    // 문자 추가 메서드
    private static void add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if(checkArr[0] == myArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if(checkArr[1] == myArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if(checkArr[2] == myArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if(checkArr[3] == myArr[3]) checkSecret++;
                break;
        }
    }

    // 문자 삭제 메서드
    private static void remove(char c) {
        switch (c) {
            case 'A':
                if(checkArr[0] == myArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if(checkArr[1] == myArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if(checkArr[2] == myArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if(checkArr[3] == myArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }
}