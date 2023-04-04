public class Fabonacci {
    public static int Fab(int x) {
        if (x == 0) {
            return 0;
        }

        if (x == 1) {
            return 1;
        }
        // int a = Fab(x - 1) ;
        // int c= Fab(x - 2);
        int b = Fab(x - 1) + Fab(x - 2);
        return b;

    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(Fab(n));
    }
}
