
public class MagicSquare {

    private int[][] matrix;
    private int size;

    public MagicSquare(int size) {
        this.size = size;
        constructMagicSquare();
    }

    private void constructMagicSquare() {
        int x = 0;
        int y = size / 2;
        matrix = new int[size][size];
        matrix[x][y] = 1;
        for (int i = 2; i <= size * size; i++) {
            int nextX = (x - 1 == -1) ? size - 1 : x - 1;
            int nextY = (y + 1 == size) ? 0 : y + 1;
            if (matrix[nextX][nextY] == 0) {
                x = nextX;
                y = nextY;
            } else {
                x = (x + 1 == size) ? 0 : x + 1;
            }

            matrix[x][y] = i;
        }
    }

    public int[][] getMagicSquare() {
        return matrix;
    }

    public int getValue(int x, int y) {
        return matrix[x][y];
    }

    public int getSize(){
        return size;
    }
}