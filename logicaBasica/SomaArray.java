package logicaBasica;

import java.util.Scanner;

public class SomaArray {
    public static void main(String[] args) {
        int tamanhovetor, soma = 0;
        Scanner n = new Scanner(System.in);
        System.out.println("Informe quantos numeros deseja somar:");
        tamanhovetor = n.nextInt();
        int[] vet1 = new int[tamanhovetor];
        System.out.println("Informe os valores para somar:");
        for (int i = 0; i < tamanhovetor; i++) {
            vet1[i] = n.nextInt();
            soma += vet1[i];
        }
        System.out.println("A soma dos valores e: " + soma);
    }
}
