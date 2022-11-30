package logicaBasica;

import java.util.Scanner;

public class MaiorMenorSimultaneo {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num1, auxmaior = 0, auxmenor = 0;
        System.out.println("Informe 10 valores:");
        for (int i = 0; i <= 10; i++) {
            num1 = n.nextInt();
            if (i == 0) {
                auxmenor = num1;
            }
            if (num1 > auxmaior) {
                auxmaior = num1;
            } else if (num1 < auxmenor) {
                auxmenor = num1;
            }
            System.out.println("O maior foi: " + auxmaior + " e o menor foi " + auxmenor);
        }
    }
}
