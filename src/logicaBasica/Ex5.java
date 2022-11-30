package logicaBasica;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a, b, c;
        System.out.println("Informe os tres lados do triangulo (A, B e C)");
        a = n.nextInt();
        b = n.nextInt();
        c = n.nextInt();
        if ((a > b) && (a > c)) {
            if (b + c > a) {
                System.out.println("Os segmentos de reta formam um triângulo");
                if ((a != b) && (b != c)) {
                    System.out.println("Ele é um triangulo escaleno");
                } else {
                    System.out.println("Ele é um triangulo isosceles");
                }
            } else {
                System.out.println("Os segmentos de reta não formam um triângulo.");
            }
        } else if ((a == b) && (b == c)) {
            System.out.println("Os segmentos de reta formam um triângulo ");
            System.out.println("Ele é um trinagulo equilatero");

        } else if ((b > a) && (b > c)) {
            if (a + c > b) {
                System.out.println("Os segmentos de reta formam um triângulo");
                if ((a != b) && (b != c)) {
                    System.out.println("Ele é um triangulo escaleno");
                } else {
                    System.out.println("Ele é um triangulo isosceles");
                }
            } else {
                System.out.println("Os segmentos de reta não formam um triângulo.");
            }

        } else if ((c > a) && (c > b)) {
            if (a + b > c) {
                System.out.println("Os segmentos de reta formam um triângulo");
                if ((a != b) && (b != c)) {
                    System.out.println("Ele é um triangulo escaleno");
                } else {
                    System.out.println("Ele é um triangulo isosceles");
                }
            } else {
                System.out.println("Os segmentos de reta não formam um triângulo.");
            }
        }
    }
}
