import org.junit.Test;

public class MagicSquareTest {

    @Test
    public void testMagicSquare3() {
        MagicSquare magicSquare = new MagicSquare(3);
        int size = magicSquare.getSize();

        //assert diagonals
        int sumDia1 = 0;
        for (int i = 0; i< size; i++) {
            sumDia1 += magicSquare.getPosition(size-i-1,i);
        }
        //assert diagonals
        int sumDia2 = 0;
        for (int i = 0; i< size; i++) {
            sumDia2 += magicSquare.getPosition(i, size-i-1);
        }
        assert sumDia2 == sumDia1;
        //assert rows
        for (int i = 0; i< size; i++) {
            int sum = 0;
            for (int j = 0; j< size; j++) {
                sum += magicSquare.getPosition(i,j);
            }
            assert sum == sumDia1;
        }

        //assert columns
        for (int i = 0; i< size; i++) {
            int sum = 0;
            for (int j = 0; j< size; j++) {
                sum += magicSquare.getPosition(j,i);
            }
            assert sum == sumDia1;
        }
    }

    @Test
    public void testMagicSquare5() {
        MagicSquare magicSquare = new MagicSquare(5);
        int size = magicSquare.getSize();

        //assert diagonals
        int sumDia1 = 0;
        for (int i = 0; i< size; i++) {
            sumDia1 += magicSquare.getPosition(size-i-1,i);
        }
        //assert diagonals
        int sumDia2 = 0;
        for (int i = 0; i< size; i++) {
            sumDia2 += magicSquare.getPosition(i, size-i-1);
        }
        assert sumDia2 == sumDia1;

        //assert rows
        for (int i = 0; i< size; i++) {
            int sum = 0;
            for (int j = 0; j< size; j++) {
                sum += magicSquare.getPosition(i,j);
            }
            assert sum == sumDia1;
        }

        //assert columns
        for (int i = 0; i< size; i++) {
            int sum = 0;
            for (int j = 0; j< size; j++) {
                sum += magicSquare.getPosition(j,i);
            }
            assert sum == sumDia1;
        }
    }
}
