
public class MagicSquare {

    private Matrix matrix;

    public MagicSquare(int size) {
        this.matrix = new Matrix(size);
        int x = 0;
        int y = size / 2;
        matrix.setPosition(x, y, 1);
        for (int i = 2; i <= size * size; i++) {
            int nextX = (x - 1 == -1) ? size - 1 : x - 1;
            int nextY = (y + 1 == size) ? 0 : y + 1;
            if (matrix.getPosition(nextX, nextY) == 0) {
                x = nextX;
                y = nextY;
            } else {
                x = (x + 1 == size) ? 0 : x + 1;
            }
            matrix.setPosition(x, y, i);
        }
    }

    public int getPosition(int x, int y) {
        return matrix.getPosition(x, y);
    }

    public int getSize(){
        return matrix.getSize();
    }
}