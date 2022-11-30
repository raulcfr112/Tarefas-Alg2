package logicaBasica;

import java.util.Scanner;

public class SomaMatrizLinha {
    public static void main(String[] args) {
        //escanear e armazenar a matriz nxn
        //mostrar a matriz
        //somar as linhas e as colunas usando for/for
        //mostrar a soma dos valores
        Scanner n = new Scanner(System.in);
        int tamanhoMatriz = 0, soma = 0;
        System.out.println("Informe o tamanho da matriz:");
        tamanhoMatriz = n.nextInt();
        int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];
        System.out.println("Informe os " + tamanhoMatriz * tamanhoMatriz + " valores desta matriz:");
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                System.out.printf("Insira o valor da linha [" + i + "] coluna [" + j + "]");
                matriz[i][j] = n.nextInt();
            }
        }
        for (int i = 0; i < tamanhoMatriz; i++) {
            soma = 0;
            for (int j = 0; j < tamanhoMatriz; j++) {
                soma += matriz[i][j];
            }
            System.out.println("A soma da linha " + i + " e " + soma);
        }
    }
}