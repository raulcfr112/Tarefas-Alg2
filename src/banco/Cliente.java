package banco;

import banco.exceptions.CPFInvalidoException;
import validator.CPFValidator;

public class Cliente {


    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) throws CPFInvalidoException {

        if(!CPFValidator.validate(cpf))
            throw new CPFInvalidoException("Cpf invalido");


        this.nome = nome;
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
