//Linear Search Program
public class LinearSearch1 {
    public static int Linear(int Num[], int key) {
        for (int i = 0; i < Num.length; i++) {
            if (Num[i] == key) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {

        int Num[] = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 7, 78,10,23};
        int key = 23;
        int index = Linear(Num, key);
        if (index == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found : " + index);
        }

    }
}
