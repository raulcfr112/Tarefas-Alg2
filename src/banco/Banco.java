package banco;

import banco.exceptions.*;

public class Banco {

    private String nome;

    private ContaCorrente[] contaCorrentes;

    public Banco(String nome, int numContacorrentes) {
        this.nome = nome;
        contaCorrentes = new ContaCorrente[numContacorrentes];
    }


    public void adicionarContaCorrente(String nomeCliente, String cpf, Double saldo) throws CPFExistenteException, CPFInvalidoException, LimiteDeContasAtingidoException {
        Cliente novoCliente = new Cliente(nomeCliente, cpf);
        ContaCorrente novaContaCorrente = new ContaCorrente(novoCliente, saldo);

        this.verificarCpfExistente(cpf);

        boolean contaAdicionada = false;
        for (int i = 0; i < contaCorrentes.length; i++) {
            if (contaCorrentes[i] == null) {
                contaCorrentes[i] = novaContaCorrente;
                contaAdicionada = true;
                System.out.println("Conta adicionada com sucesso!");
                break;
            }
        }

        if (!contaAdicionada)
            throw new LimiteDeContasAtingidoException("Conta nao adicionada! Sem espaço na memória!");
    }

    private void verificarCpfExistente(String cpf) throws CPFExistenteException {
        for (ContaCorrente contaCorrente: contaCorrentes) {
            if (contaCorrente != null) {
                if (contaCorrente.getCliente().getCpf().equals(cpf)) {
                    throw new CPFExistenteException("CPF já existente!");
                }
            }
        }
    }

    public void excluirConta(String cpf){
        for (int i = 0; i < contaCorrentes.length; i++) {
            if (contaCorrentes[i]!=null){
                if (contaCorrentes[i].getCliente().getCpf().equals(cpf)){
                    contaCorrentes[i]=null;
                    System.out.println("Conta removida!");
                    break;
                }
            }
        }
    }

    public void sacar(String cpf,double valor) throws SaqueNegativoException, SaqueAcimaDoSaldoException, LimiteSaqueAtingidoException {
        for (ContaCorrente conta:contaCorrentes) {
            if (conta!=null){
                if (conta.getCliente().getCpf().equals(cpf)){
                    if (conta.getSaldo()-valor<0){
                        throw new SaqueNegativoException("Valor solicitado ultrapassou seu saldo!");
                    }
                    if (valor>conta.getSaldo()){
                        throw new SaqueAcimaDoSaldoException("Valor do saque superior ao saldo em conta!");
                    }
                    if (valor>5000){
                        throw new LimiteSaqueAtingidoException("Limite de saque atingido!(R$5.000)");
                    }
                    conta.setSaldo(conta.getSaldo()-valor);
                    System.out.println("Saque realizado! novo saldo:" +conta.getSaldo());
                    break;
                }
            }
        }
    }

    public void depositar(String cpf,double valor) throws DepositoComValorNegativoException {
        if (valor<0){
            throw new DepositoComValorNegativoException("Nao e possivel depositar um valor negativo!");
        }
        for (ContaCorrente conta:contaCorrentes) {
            if (conta!=null){
                if (conta.getCliente().getCpf().equals(cpf)){
                    conta.setSaldo(conta.getSaldo()+valor);
                    System.out.println("Deposito realizado! novo saldo:" +conta.getSaldo());
                    break;
                }
            }
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ContaCorrente[] getContaCorrentes() {
        return contaCorrentes;
    }

    public void setContaCorrentes(ContaCorrente[] contaCorrentes) {
        this.contaCorrentes = contaCorrentes;
    }


}
