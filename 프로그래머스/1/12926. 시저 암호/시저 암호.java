import java.util.Arrays;

class Solution {
    public static String solution(String s, int n) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c != ' ') {
                int ascii = (int) c;
                ascii += n;
                if (Character.isUpperCase(c) && ascii > 90) {
                    ascii -= 26;
                }
                if (Character.isLowerCase(c) && ascii > 122) {
                    ascii -= 26;
                }
                char changedC = (char) ascii;
                arr[i] = changedC;
            }
        }

        return new String(arr);
    }
}