package oo;

import java.util.Scanner;

public class CirculoApp {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        int quantidadeDeCirculos, valorRaio, ctgNome = 1;
        String valorNome = "Circulo ";

        System.out.println("Informe quantos circulos serão lidos:");
        quantidadeDeCirculos = n.nextInt();

        Circulo vetorCirculo[] = new Circulo[quantidadeDeCirculos];

        for (int i = 0; i < quantidadeDeCirculos; i++) {
            System.out.println("Qual será o raio do " + (i + 1) + " circulo?:");
            valorRaio = n.nextInt();

            valorNome += ctgNome;

            Circulo c1 = new Circulo(valorRaio, valorNome);

            vetorCirculo[i] = c1;

            valorNome = "Circulo ";
            ctgNome++;
        }
        for (int i = 0; i < quantidadeDeCirculos; i++) {
            System.out.println(vetorCirculo[i].toString());
        }
    }
}
