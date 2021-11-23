public class Main {
    public static void main(String[] args){
        MagicSquare magicSquare = new MagicSquare(3);
        int size = magicSquare.getSize();
        for (int i = 0; i< size; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j< size; j++) {
                str.append(magicSquare.getValue(i,j));
                str.append(" ");
            }
            System.out.println(str.toString());
        }
    }
}
