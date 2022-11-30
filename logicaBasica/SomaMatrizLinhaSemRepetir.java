package logicaBasica;

import java.util.Scanner;

public class SomaMatrizLinhaSemRepetir {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int tamanhoMatriz = 0, valor;
        System.out.println("Informe o tamanho da matriz:");
        tamanhoMatriz = n.nextInt();
        int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];
        System.out.println("Informe os " + tamanhoMatriz * tamanhoMatriz + " valores desta matriz:");
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                System.out.printf("Insira o valor da linha [" + i + "] coluna [" + j + "]");
                valor = n.nextInt();
                boolean encontrou = false;
                for (int k = 0; k < j; k++) {
                    if (valor == matriz[i][k]) {
                        encontrou = true;
                        break;
                    }
                }
                if (encontrou == true) {
                    System.out.println("Informe um valor ainda nao insirido nesta linha!");
                    j--;
                } else {
                    matriz[i][j] = valor;
                }
            }
        }
        for (int i = 0; i < tamanhoMatriz; i++) {
            System.out.println();
            for (int j = 0; j < tamanhoMatriz; j++) {
                System.out.printf(matriz[i][j] + " ");
            }
        }
    }
}
