import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. split 대신 StringTokenizer를 사용하여 공백 예외 처리 방지
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 2. HashMap 대신 HashSet 사용 (메모리 절약 및 성능 향상)
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        // 첫 번째 집합 입력
        for(int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        // 두 번째 집합을 입력받으며 동시에 교집합 검사
        for(int i = 0; i < m; i++) {
            String name = br.readLine();
            // set에 이미 존재하는 이름이라면 교집합에 해당
            if(set.contains(name)) {
                list.add(name);
            }
        }

        // 사전순 정렬
        Collections.sort(list);

        // 출력부 (total 변수를 따로 쓸 필요 없이 list.size() 활용)
        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append("\n");
        
        for(String name : list) {
            sb.append(name).append("\n");
        }

        System.out.print(sb);
    }
}