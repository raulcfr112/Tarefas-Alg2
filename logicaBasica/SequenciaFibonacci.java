package logicaBasica;

import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        int quantidaden, soma, num1 = 1, num2 = 1, check = 0;
        Scanner n = new Scanner(System.in);
        System.out.println("Insira quantos numeros deseja da sequencia de Fibonacci:");
        quantidaden = n.nextInt();
        if (quantidaden < 2) {
            System.out.println("A sequencia de Fibonacci precisa comecar com 2 (1+1)");
            System.exit(0);
        }
        quantidaden -= 3;
        System.out.print("Sequencia: 1, 1,");
        for (int i = 0; i <= quantidaden; i++) {
            soma = num1 + num2;
            if (soma == quantidaden + 3) {
                check++;
            }
            System.out.print(" " + soma + ",");
            num1 = num2;
            num2 = soma;
        }
        quantidaden += 3;
        if (check > 0) {
            System.out.println();
            System.out.println("O numero " + quantidaden + " faz parte da sequencia de Fibonacci!");
        } else {
            System.out.println();
            System.out.println("O numero " + quantidaden + " nao faz parte da sequencia de Fibonacci!");
        }
    }
}
