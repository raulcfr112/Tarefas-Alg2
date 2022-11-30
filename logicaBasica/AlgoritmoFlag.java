package logicaBasica;

import java.util.Scanner;

public class AlgoritmoFlag {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num, soma = 0, media, tamanholista;
        System.out.println("Informe os valores desejados: (digite 9999 para parar)");
        do {
            num = n.nextInt();
            if (num != 9999) {
                soma += num;

            }
        } while (num != 9999);
        System.out.println("A soma dos valores informados e: " + soma);
        System.out.println("Informe o tamanho da lista:");
        tamanholista = n.nextInt();
        System.out.println("Informe os " + tamanholista + " numeros:");
        soma = 0;
        for (int i = 1; i <= tamanholista; i++) {
            num = n.nextInt();
            soma += num;
        }
        media = soma / tamanholista;
        System.out.println("A soma da lista informada e: " + soma + " e a media e: " + media);
    }
}
