package logicaBasica;

import java.util.Scanner;

public class DiagonalNImpar {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int tamanhoDiagonal, aux = 0;
        System.out.println("Informe o tamanho da diagonal:");
        tamanhoDiagonal = n.nextInt();
        if (tamanhoDiagonal % 2 == 0) {
            System.out.println("Informe um valor impar!");
            System.exit(0);
        }
        aux = tamanhoDiagonal;
        for (int i = 1; i <= tamanhoDiagonal; i++) {
            System.out.println();
            for (int k = 1; k <= tamanhoDiagonal; k++) {
                if (k == aux) {
                    System.out.printf(k + " ");
                    aux--;
                } else if (i == k) {
                    System.out.printf(i + " ");

                } else {
                    System.out.printf("- ");
                }
            }
        }

    }
}
