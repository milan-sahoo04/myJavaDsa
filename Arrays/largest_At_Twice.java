import java.util.*;

public class largest_At_Twice {

    public static int twice(int arr[]) {
        // int max = Integer.MIN_VALUE;
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // sum = arr[i] + arr[i];
        // max = Math.max(max, sum);
        // if (arr[i] >= max) {
        // return i;
        // }
        // }
        // return -1;

        int large = Integer.MIN_VALUE;
        int sLarge = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (large < arr[i]) {
                sLarge = large;
                large = arr[i];
                index = i;
            } else if (sLarge < arr[i]) {
                sLarge = arr[i];
            }
        }
        if (large >= 2 * sLarge)
            return index;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 8 };
        System.out.println(twice(arr));
        sc.close();
    }
}
