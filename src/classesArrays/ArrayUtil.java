package classesArrays;

public class ArrayUtil {

    static boolean localizarNumero(int valorX,int [] arraysInt){
        for (int i = 0; i < arraysInt.length; i++) {
            if (valorX==arraysInt[i]){
                return true;
            }
        }
        return false;
    }

    static boolean localizarNumero(int valorY,int matrizInt[][]){
        for (int i = 0; i < matrizInt.length; i++) {
            for (int j = 0; j < matrizInt.length; j++) {
                if (matrizInt[i][j] == valorY) {
                    return true;
                }
            }
        }
        return false;
    }

    static void imprimir(int[] array){
        System.out.printf("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d " , array[i]);
        }
        System.out.printf("]");
    }

    public static void imprimir(int[][] matriz)
    {
        for(int i = 0; i < matriz.length; i++){
            System.out.printf("[ ");
            for( int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.printf("]");
            System.out.println();
        }
    }

    static void ordenarCrescente(int[] arrayInt){
        int aux;
        for(int i =0; i<arrayInt.length; i++){
            for(int j =0; j <(arrayInt.length-1); j++){
                if(arrayInt[j]> arrayInt[j+1]){
                    aux = arrayInt[j];
                    arrayInt[j] = arrayInt[j+1];
                    arrayInt[j+1] = aux;
                }
            }
        }
    }

    static void ordenarDecrescente(int[] arrayInt){
        int aux;
        for(int i =0; i<arrayInt.length; i++){
            for(int j =0; j <(arrayInt.length-1); j++){
                if(arrayInt[j]< arrayInt[j+1]){
                    aux = arrayInt[j];
                    arrayInt[j] = arrayInt[j+1];
                    arrayInt[j+1] = aux;
                }
            }
        }
    }

    static void ordenar(int[] arrayInt, int escolhaMenu){

        if (escolhaMenu==1){
            ArrayUtil.ordenarCrescente(arrayInt);
        } else if (escolhaMenu==2) {
            ArrayUtil.ordenarDecrescente(arrayInt);
        }else {
            System.out.println("Erro! \nInforme 1, ou 2!");
        }
    }
}
