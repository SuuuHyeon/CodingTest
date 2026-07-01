import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static char[][] board;

    static int check(int x, int y) {
        int whiteStart = 0;
        int blackStart = 0;

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {

                if ((i + j) % 2 == 0) {
                    // W로 시작하는 경우
                    if (board[i][j] != 'W') whiteStart++;
                    // B로 시작하는 경우
                    if (board[i][j] != 'B') blackStart++;
                } else {
                    if (board[i][j] != 'B') whiteStart++;
                    if (board[i][j] != 'W') blackStart++;
                }
            }
        }

        return Math.min(whiteStart, blackStart);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                answer = Math.min(answer, check(i, j));
            }
        }

        System.out.println(answer);
    }
}