package logicaBasica;

import java.util.Scanner;

public class SomaDeAaB {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a, b, soma = 0;
        System.out.println("Informe o valor de A:");
        a = n.nextInt();
        System.out.println("Informe o valor de B");
        b = n.nextInt();
        if (a > b) {
            System.out.println("O valor de A tem que ser menor que B!");
            System.exit(0);
        }
        for (int i = 0; a <= b; i++) {
            soma += a;
            a++;
        }
        System.out.println("A soma de A ate B é: " + soma);
    }
}
