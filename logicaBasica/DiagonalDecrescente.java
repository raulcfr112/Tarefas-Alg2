package logicaBasica;

import java.util.Scanner;

public class DiagonalDecrescente {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int tamanhoDiagonal, aux = 0;
        System.out.println("Informe o tamanho da diagonal decrescente:");
        tamanhoDiagonal = n.nextInt();
        aux = tamanhoDiagonal;
        for (int i = 1; i <= aux; i++) {
            System.out.println();
            for (int k = 1; k <= tamanhoDiagonal; k++) {
                if (k == tamanhoDiagonal) {
                    System.out.printf("- ");
                    tamanhoDiagonal--;
                    break;
                } else {
                    System.out.printf("- ");
                }
            }
        }
    }
}
