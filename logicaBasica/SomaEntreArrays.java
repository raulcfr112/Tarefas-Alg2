package logicaBasica;

import java.util.Arrays;
import java.util.Scanner;

public class SomaEntreArrays {
    public static void main(String[] args) {
        int quantidadevalores;
        Scanner n = new Scanner(System.in);
        System.out.println("Informe a quantidade de valores que deseja somar:");
        quantidadevalores = n.nextInt();
        int[] vetA = new int[quantidadevalores];
        System.out.println("Informe os valores A:");
        for (int i = 0; i < quantidadevalores; i++) {
            vetA[i] = n.nextInt();
        }
        int[] vetB = new int[quantidadevalores];
        System.out.println("Informe os valores B:");
        for (int i = 0; i < quantidadevalores; i++) {
            vetB[i] = n.nextInt();
        }
        int[] vetC = new int[quantidadevalores];
        for (int i = 0; i < quantidadevalores; i++) {
            vetC[i] = vetA[i] + vetB[i];
        }
        System.out.println("Vetor A: " + Arrays.toString(vetA));
        System.out.println("Vetor B: " + Arrays.toString(vetB));
        System.out.println("Vetor C: " + Arrays.toString(vetC));

    }
}
