package logicaBasica;

import java.util.Scanner;

public class MediaNumerosImpares {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num1, soma = 0, ctg = 0, media;
        System.out.println("Informe um valor para media: (Informe 0 para calcular os valores)");
        do {
            num1 = n.nextInt();
            soma += num1;
            if (num1 != 0) {
                ctg++;
            }

        } while (num1 % 2 == 0 && num1 != 0);
        if (num1 % 2 != 0) {
            System.out.println("Informe um valor par!");
        } else {
            media = soma / ctg;
            System.out.println("A media dos numeros pares digitados foi: " + media);
        }
    }
}
