package figurasGeometricas;

import figurasGeometricas.Exceptions.VetorCheioException;

import java.util.Scanner;

public class FiguraGeometricaApp {
    static FiguraGeometrica[] figurasG = new FiguraGeometrica[10];

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        int escolhaMenu;

        do {
            System.out.println("1-Adicionar Triangulo\n" +
                    "2-Adicionar Quadrado\n" +
                    "3-Adicionar Retangulo\n" +
                    "4-Adicionar Circulo\n" +
                    "5-Listar \n" +
                    "6-Sair");
            escolhaMenu = n.nextInt();
            switch (escolhaMenu) {
                case 1:
                    System.out.println("Informe os 3 lados do triangulo e a altura:");
                    try {
                        Triangulo.adicionarTriangulo(n.nextInt(), n.nextInt(), n.nextInt(), n.nextInt());
                    } catch (VetorCheioException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Informe o lado do Quadrado:");
                    try {
                        Quadrado.adicionarQuadrado(n.nextInt());
                    } catch (VetorCheioException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Informe a base e a altura do retangulo:");
                    try {
                        Retangulo.adicionaRetangulo(n.nextInt(), n.nextInt());
                    } catch (VetorCheioException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Informe o Raio do circulo:");
                    try {
                        Circulo.adicionarCirculo(n.nextFloat());
                    } catch (VetorCheioException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    for (int i = 0; i < figurasG.length; i++) {
                        if (figurasG[i] != null) {
                            System.out.println(figurasG[i].toString());
                        }
                    }
                    break;

            }
            if (escolhaMenu > 6) {
                System.out.println("Erro! Informe um valor valido!\n");
            }
        } while (escolhaMenu != 6);
    }
}
