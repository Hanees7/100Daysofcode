public class TilingProb {
    public static int Tiling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // For verticle
        int V = Tiling(n - 1);

        // For HoriZontal
        int H = Tiling(n - 2);

        int Both = V + H;
        return Both;
    }

    public static void main(String[] args) {
        System.out.println(Tiling(3));
    }
}
