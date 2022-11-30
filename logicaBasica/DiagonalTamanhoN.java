package logicaBasica;

import java.util.Scanner;

public class DiagonalTamanhoN {
    public static void main(String[] args) {
        int tamanhomatriz;
        Scanner n = new Scanner(System.in);
        System.out.println("Informe o tamanho da matriz ");
        tamanhomatriz = n.nextInt();
        for (int i = 1; i <= tamanhomatriz; i++) {
            System.out.println();
            for (int k = 1; k <= tamanhomatriz; k++) {
                if (i == k) {
                    System.out.printf(i + " ");
                } else {
                    System.out.printf("- ");
                }
            }
        }
    }
}
