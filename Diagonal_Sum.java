public class DiagonalSum {
    public static int DiagonalSUM(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];

                }
                if (i + j == matrix.length - 1) { // i+j ==3
                    sum += matrix[i][j];

                }
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };

        System.out.println(DiagonalSUM(matrix));
    }
}
