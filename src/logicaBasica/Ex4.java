package logicaBasica;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        float a, b, c, d, e, f, x, y;
        Scanner n = new Scanner(System.in);
        System.out.println("Informe os valores de a, b, c, d, e e f na ordem");
        a = n.nextFloat();
        b = n.nextFloat();
        c = n.nextFloat();
        d = n.nextFloat();
        e = n.nextFloat();
        f = n.nextFloat();
        x = ((c * d - b * f)) / ((a * e - d * f));
        y = ((a * f - c * d)) / ((a * e - b * d));
        System.out.println("O valor de x e: " + x);
        System.out.println("O valor de y e: " + y);

    }
}
