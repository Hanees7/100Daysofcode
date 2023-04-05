
public class SortedArrayRe {
    public static boolean Sort(int arr[], int i) {
        if (arr.length - 1 == i) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        boolean g = Sort(arr, i + 1);
        return g;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 7, 160 };
        System.out.println(Sort(arr, 0));
    }
}
