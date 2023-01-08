public class SegregateP {
    public static void main(String[] args) {
        int a = 5;

        // int b = 01010;
        int arr[] = { 0, 1, 0, 1, 0 };
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }
    }
}
