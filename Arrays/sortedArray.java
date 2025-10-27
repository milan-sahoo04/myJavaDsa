public class sortedArray {
    public static boolean isSorted(int num[]) {
        // int l = 0, r = num.length - 1;
        // while (l < r) {
        // if (num[l] < num[r]) {
        // l++;
        // r--;
        // } else {

        // return false;
        // }
        // }
        // return true;

        int count = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] < num[i - 1])
                count++;
        }
        if (num[num.length - 1] > num[0])
            count++;
        return count <= 1;
    }

    public static void main(String[] args) {
        int num[] = { 6, 1, 2 };
        System.out.println(isSorted(num));
    }
}
