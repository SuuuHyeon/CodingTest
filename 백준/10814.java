import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<String[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(br.readLine().split(" "));
        }

        list.sort((a, b) -> Integer.parseInt(a[0]) - Integer.parseInt(b[0]));

        StringBuilder sb = new StringBuilder();

        for (String[] member : list) {
            sb.append(member[0]).append(" ")
              .append(member[1]).append("\n");
        }

        System.out.print(sb);
    }
}