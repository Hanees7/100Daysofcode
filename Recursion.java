public class RecursionBasic2 {
    public static void PrintInc(int a) {
        if (a == 1) {
            System.out.println(a);
            return;
        }
        PrintInc(a - 1);
        System.out.print(a);

    }

    public static void main(String[] args) {
        int n = 5;
        PrintInc(n);
    }
}
