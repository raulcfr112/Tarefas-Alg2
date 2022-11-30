package classesArrays;

public class MatrixOperationsApp {
    public static void main(String[] args) {

        /** declaração de matrizes
         *     declarei as matrizes com a mesma ordem, mas fiz o teste caso elas nao tiverem
         *     caso queira testar se esta somando,subtraindo ou se as matrizes tem a mesma ordem, altere aqui
         */
        int[][] mA = {{21, 17, 15}, {18, 13, 9}, {11, 9, 3}};
        int[][] mB = {{23, 14, 17}, {17, 16, 8}, {18, 10, 5}};

        if (mA.length == mB.length && mA[0].length == mB[0].length) {

            MatrixOperations.PrintAdd(mA, mB);

            System.out.println("");

            MatrixOperations.PrintSub(mA, mB);

        } else {
            System.out.println("As matrizes nao tem a mesma ordem!");
        }
    }
}