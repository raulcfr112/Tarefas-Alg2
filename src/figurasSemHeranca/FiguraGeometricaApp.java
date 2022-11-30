package figurasSemHeranca;

import figurasGeometricas.Exceptions.VetorCheioException;

import java.util.Scanner;

public class FiguraGeometricaApp {

    public static void main(String[] args) {

        String[] figuras = new String[10];

        Scanner n = new Scanner(System.in);

        int escolhaMenu;

        do {
            System.out.println("\n1-Adicionar Triangulo\n" +
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
                        figuras = Triangulo.adicionarTriangulo(n.nextInt(), n.nextInt(), n.nextInt(), n.nextInt(), figuras);
                    } catch (VetorCheioException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Informe o lado do Quadrado:");
                    try {
                        figuras = Quadrado.adicionarQuadrado(n.nextInt(), figuras);
                    } catch (VetorCheioException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Informe a base e a altura do retangulo:");
                    try {
                        figuras = Retangulo.adicionaRetangulo(n.nextInt(), n.nextInt(), figuras);
                    } catch (VetorCheioException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Informe o Raio do circulo:");
                    try {
                        figuras = Circulo.adicionarCirculo(n.nextFloat(), figuras);
                    } catch (VetorCheioException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:

//                    for (String elemento : figuras) {
//                        if (elemento != null) {
//                            System.out.println(elemento);
//                        }
//                    }
                    break;

            }
            if (escolhaMenu > 6) {
                System.out.println("Erro! Informe um valor valido!\n");
            }
        } while (escolhaMenu != 6);
    }
}

