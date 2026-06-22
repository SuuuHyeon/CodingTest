import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if (str.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for (char ch : str.toCharArray()) {

                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                }

                else if (ch == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }

                else if (ch == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (isValid && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}