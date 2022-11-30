package logicaBasica;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner n = new Scanner(System.in);
        System.out.println("Informe 3 numeros inteiros:");
        num1 = n.nextInt();
        num2 = n.nextInt();
        num3 = n.nextInt();
        if ((num1 >= num2) && (num1 >= num3)) {
            if (num2 <= num3) {
                System.out.println("A ordem crescente é:" + num2 + "," + num3 + "," + num1);
            } else {
                System.out.println("A ordem crescente é:" + num3 + "," + num2 + "," + num1);

            }
        } else if ((num2 >= num1) && (num2 >= num3)) {
            if (num1 <= num3) {
                System.out.println("A ordem crescente é:" + num1 + "," + num3 + "," + num2);
            } else {
                System.out.println("A ordem crescente é:" + num3 + "," + num1 + "," + num2);

            }
        } else if ((num3 >= num1) && (num3 >= num2)) {
            if (num1 <= num2) {
                System.out.println("A ordem crescente é:" + num1 + "," + num2 + "," + num3);

            } else {
                System.out.println("A ordem crescente é:" + num2 + "," + num1 + "," + num3);

            }

        }

    }
}
