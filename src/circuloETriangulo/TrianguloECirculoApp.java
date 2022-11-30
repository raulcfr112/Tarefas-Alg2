package circuloETriangulo;

import java.util.Scanner;

public class TrianguloECirculoApp {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        int valorRaio,valorLado1,valorLado2,valorLado3,escolhaMenu,nomeCirculoCtg=1,nomeTrianguloCtg=1,controleVetorCirculo=0,controleVetorTriangulo=0;
        String nomeCirculo="Circulo ",nomeTriangulo="Triangulo ";
        Triangulo vetorTriangulo [] = new Triangulo[10];
        Circulo vetorCirculo [] = new Circulo[10];

        do {
            menu();
            escolhaMenu=n.nextInt();

            if (escolhaMenu==1){

                if (controleVetorCirculo==10){
                    System.out.println("Erro! \nValor maximo de circulos atingidos!");
                } else {

                    System.out.println("Informe o raio do circulo: ");

                    valorRaio = n.nextInt();
                    nomeCirculo+=nomeCirculoCtg;

                    Circulo c1 = new Circulo(nomeCirculo, valorRaio);

                    vetorCirculo[controleVetorCirculo] = c1;
                    nomeCirculo="Circulo ";
                    controleVetorCirculo++;
                    nomeCirculoCtg++;
                }

            } else if (escolhaMenu==2) {

                if (controleVetorTriangulo==10){

                    System.out.println("Erro! \nValor maximo de triangulos atingidos!");

                }else {

                    System.out.println("Informe os lados 1, 2 e 3 do triangulo respectivamente: ");
                    valorLado1=n.nextInt();
                    valorLado2=n.nextInt();
                    valorLado3=n.nextInt();

                    nomeTriangulo+=nomeTrianguloCtg;

                    Triangulo t1 = new Triangulo(valorLado1,valorLado2,valorLado3,nomeTriangulo);

                    if (t1.isTriangulo()) {
                        t1.setTipo(t1.isTipo());
                    } else {
                        t1.setTipo("Ele nao e um triangulo");
                    }

                    vetorTriangulo[controleVetorTriangulo]=t1;

                    controleVetorTriangulo++;
                    nomeTrianguloCtg++;
                    nomeTriangulo="Triangulo ";
                    
                }

            } else if (escolhaMenu==3){

                for (int i = 0; i < controleVetorCirculo; i++) {
                    System.out.println(vetorCirculo[i].toString());
                }

            } else if (escolhaMenu==4) {
                for (int i = 0; i < controleVetorTriangulo; i++) {
                    System.out.println(vetorTriangulo[i].toString());
                }
            }else if (escolhaMenu==5){
                System.exit(0);

            }else {
                System.out.println("Erro! \nInforme um valor valido!");
            }

        }while (escolhaMenu!=5);
    }
    public static void menu(){
        System.out.println("\n*-- MENU --*");
        System.out.println("1) adicionar circulo\n" +
                "\n" +
                "2) adicionar triangulo\n" +
                "\n" +
                "3) imprimir circulos \n" +
                "\n" +
                "4) imprimir triangulos\n" +
                "\n" +
                "5) sair");
    }
}