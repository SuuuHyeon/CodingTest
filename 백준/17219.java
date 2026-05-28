import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); // 사이트 주소 수
        int m = Integer.parseInt(st.nextToken()); // 비밀번호를 찾으려는 사이트 주소 수
        
        HashMap<String, String> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String password = st.nextToken();
            map.put(site, password);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < m; i++) {
            String searchSite = br.readLine();
            sb.append(map.get(searchSite)).append("\n"); 
        }
        
        System.out.print(sb.toString());
    }
}