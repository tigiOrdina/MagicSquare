public class Matrix {
    private int[][] matrix;
    private int size;

    public Matrix(int size) {
        this.size = size;
        this.matrix = new int[size][size];
    }

    public int getPosition(int x, int y) {
        return matrix[x][y];
    }

    public void setPosition(int x, int y, int value) {
        matrix[x][y] = value;
    }

    public int getSize() {
        return size;
    }
}
