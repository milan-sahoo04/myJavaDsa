import java.util.*;

class sort_char_By_Frequency {
    public static String sort_by_freq(String str) {
        String[] str1 = str.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = str1.length - 1; i >= 0; i--) {
            sb.append(str1[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "cccaaa";
        System.out.println(sort_by_freq(str));
        sc.close();
    }
}
