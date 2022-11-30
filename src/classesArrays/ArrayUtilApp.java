package classesArrays;

import java.util.Scanner;

public class ArrayUtilApp {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        int localizarTesteTrue=1,localizarTesteFalse=67,escolhaMenu;

        int []testeArray ={50,23,31,1};
        int [][] testeMatriz = {{65,85,75,5},{56,35,65,4},{54,85,98,9}};

        //Loop para o usuario informar o valor certo
        do {
            System.out.println("Informe 1 para ordenar de forma nao decrescente ou 2 para de forma nao crescente.");
            escolhaMenu = n.nextInt();
            ArrayUtil.ordenar(testeArray, escolhaMenu);
        }while (escolhaMenu!=1 && escolhaMenu!=2);

        //Imprime o array, a ordem do array depende da escolha do usuario no menu acima
        System.out.println("Imprimindo Array:");
        ArrayUtil.imprimir(testeArray);

        //Imprime a matriz
        System.out.println("\nImprimindo Matriz:");
        ArrayUtil.imprimir(testeMatriz);

        //Teste booleano ja com valores definidos na variavel
        if (ArrayUtil.localizarNumero(localizarTesteTrue,testeArray)){
            System.out.println("O numero " + localizarTesteTrue + " foi encontrado no Array!");
        }else {
            System.out.println("O numero " + localizarTesteTrue + " nao foi encontrado no Array!");
        }
        if (ArrayUtil.localizarNumero(localizarTesteFalse,testeMatriz)){
            System.out.println("O numero " + localizarTesteTrue + " foi encontrado na Matriz!");
        }else {
            System.out.println("O numero " + localizarTesteFalse + " nao foi encontrado na Matriz!");
        }
    }
}
