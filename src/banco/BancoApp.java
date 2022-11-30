package banco;

import banco.exceptions.*;

import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        int escolhaMenu;

        Banco bradesco = new Banco("Bradesco", 10);

        do {
            System.out.println("*--- MENU ---*\n" +
                    "1- Adicionar conta corrente:\n" +
                    "2- Excluir conta:\n" +
                    "3- Sacar:\n" +
                    "4- Depositar\n" +
                    "5- Sair:\n");
            escolhaMenu = n.nextInt();

            switch (escolhaMenu) {
                case 1:
                    System.out.println("Informe o nome, seu CPF e o saldo inicial:");
                    try {
                        bradesco.adicionarContaCorrente(n.next(), n.next(), n.nextDouble());
                    } catch (LimiteDeContasAtingidoException e) {
                        System.out.println("Ocorreu o erro 1: " + e.getMessage());
                    } catch (CPFInvalidoException e) {
                        System.out.println("Ocorreu o erro 2: " + e.getMessage());
                    } catch (CPFExistenteException e) {
                        System.out.println("Ocorreu o erro 3: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Informe o cpf da conta que deseja excluir:");
                    bradesco.excluirConta(n.next());
                    break;
                case 3:
                    System.out.println("Informe o cpf da conta que deseja sacar, em seguida o valor:");
                    try {
                        bradesco.sacar(n.next(), n.nextDouble());
                    } catch (SaqueNegativoException e) {
                        System.out.println("Ocorreu o erro 1: " + e.getMessage());
                    } catch (SaqueAcimaDoSaldoException e) {
                        System.out.println("Ocorreu o erro 2: " + e.getMessage());
                    } catch (LimiteSaqueAtingidoException e) {
                        System.out.println("Ocorreu o erro 3: " + e.getMessage());
                    }

                    break;
                case 4:
                    System.out.println("Informe o cpf da conta que deseja depositar, em seguida o valor:");
                    try {
                        bradesco.depositar(n.next(), n.nextDouble());
                    } catch (DepositoComValorNegativoException e) {
                        System.out.println("Ocorreu o erro : " + e.getMessage());
                    }
                    break;
            }
            if (escolhaMenu > 5) {
                System.out.println("Erro! Informe um valor valido!\n");
            }
        }while (escolhaMenu != 5) ;
    }
}
