package produto;

import java.util.Scanner;

public class ProdutoApp {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        int escolhaMenu,tipoEscolha;

        do {
            Produto p1 ;
            System.out.println("*--- MENU ---*\n");
            System.out.println("Informe uma das opcoes abaixo:\n" +
                    "1- Cadastrar Produto:\n" +
                    "2- Listar produtos por tipo: \n" +
                    "3- Excluir Produto por Codigo: \n" +
                    "4- Sair:");
            escolhaMenu = n.nextInt();

            switch (escolhaMenu){
                case 1:
                    System.out.println("Informe qual o tipo do produto:\n" +
                            "1- Calcados \n" +
                            "2- Perfumaria \n" +
                            "3- Vestuario");
                    tipoEscolha=n.nextInt();
                    switch (tipoEscolha){
                        case 1:
                            System.out.println("Informe o codigo do produto, a descricao e o valor:");
                            p1 = new Produto(n.nextInt(),Tipo.CALCADOS,n.next(),n.nextDouble());
                            ProdutoDB.cadastro(p1);
                            break;
                        case 2:
                            System.out.println("Informe o codigo do produto, a descricao e o valor:");
                            p1 = new Produto(n.nextInt(),Tipo.PERFUMARIA,n.next(),n.nextDouble());
                            ProdutoDB.cadastro(p1);
                            break;
                        case 3:
                            System.out.println("Informe o codigo do produto, a descricao e o valor:");
                            p1 = new Produto(n.nextInt(),Tipo.VESTUARIO,n.next(),n.nextDouble());
                            ProdutoDB.cadastro(p1);
                            break;
                    }

                    break;
                case 2:
                    System.out.println("Informe qual o tipo do produto:\n" +
                            "1- Calcados \n" +
                            "2- Perfumaria \n" +
                            "3- Vestuario");
                    tipoEscolha=n.nextInt();
                    switch (tipoEscolha){
                        case 1:
                            ProdutoDB.listarProdutos(Tipo.CALCADOS);
                            break;
                        case 2:
                            ProdutoDB.listarProdutos(Tipo.PERFUMARIA);
                            break;
                        case 3:
                            ProdutoDB.listarProdutos(Tipo.VESTUARIO);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Informe o codigo do produto que deseja excluir:");
                    ProdutoDB.excluirCadastro(n.nextInt());
                    break;
            }

            if (escolhaMenu>4){
                System.out.println("Erro! Informe um valor valido!\n");
            }

        }while (escolhaMenu!=4);
    }
}