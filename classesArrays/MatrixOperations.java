package classesArrays;

public class MatrixOperations {

    static int[][] matrizC;

    public static void PrintAdd(int[][] matrizA, int[][] matrizB) {
        Add(matrizA, matrizB);
        ArrayUtil.imprimir(matrizC);
    }

    public static int[][] Add(int[][] matrizA, int[][] matrizB) {

        int[][] matrizC1 = new int[matrizA.length][matrizA[0].length];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                matrizC1[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        matrizC = matrizC1;

        return matrizC;
    }

    public static void PrintSub(int[][] matrizA, int[][] matrizB) {
        Sub(matrizA, matrizB);
        ArrayUtil.imprimir(matrizC);
    }


    public static int[][] Sub(int[][] matrizA, int[][] matrizB) {

        int[][] matrizC1 = new int[matrizA.length][matrizA[0].length];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                matrizC1[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }

        matrizC = matrizC1;

        return matrizC;
    }
}
