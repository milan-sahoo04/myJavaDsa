import java.util.*;

class thirdMaxNumber {
    // BRUTE
    // public static int third(int arr[]) {
    // HashSet<Integer> set = new HashSet<>();
    // for (int num : arr)
    // set.add(num);

    // ArrayList<Integer> list = new ArrayList<>(set);
    // Collections.sort(list, Collections.reverseOrder());

    // if (list.size() >= 3)
    // return list.get(2);
    // else
    // return list.get(0);

    // }

    // Optimal
    public static int third(int arr[]) {

        Long first = null, second = null, third = null;
        for (int num : arr) {
            long n = num;
            if (first != null && n == first || second != null && n == second || third != null && n == third)
                continue;

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } else if (second == null || n > second) {
                third = second;
                second = n;
            } else if (third == null || n > third) {
                third = n;

            }
        }

        return third == null ? first.intValue() : third.intValue();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1 };
        System.out.println(third(arr));
    }
}
