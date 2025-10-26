public class remvDplcts_FromSrtd {
    public static int sorted_unique(int arr[]) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[count])
                count++;
            arr[count] = arr[i];
        }
        return count + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3 };
        System.out.println(sorted_unique(arr));
    }
}
