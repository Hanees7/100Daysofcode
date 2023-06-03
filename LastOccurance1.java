public class LastOccurance {
    public static int Last(int arr[], int key, int i) {
        if (arr[i] != key) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return Last(arr, key, i - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 7 };
        int key = 7;
        int i = arr.length - 1;

        System.out.println(Last(arr, key, i));
    }
}
