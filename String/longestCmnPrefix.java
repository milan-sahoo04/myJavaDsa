import java.util.*;

public class longestCmnPrefix {
    public static String cmnPreix(String str[]) {
        if (str == null || str.length == 0)
            return "";
        StringBuilder sb = new StringBuilder();
        Arrays.sort(str);
        char[] first = str[0].toCharArray();
        char[] last = str[str.length - 1].toCharArray();
        for (int i = 0; i < first.length && i < last.length; i++) {
            if (first[i] != last[i])
                break;
            sb.append(first[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str[] = { "aop", "ao" };
        System.out.println(cmnPreix(str));
    }
}
