package produto;

public class Produto {

    Integer codigo;
    String descricao;
    double valor;
    Tipo tipo_de_enum;

    public Produto(Integer codigo,Tipo tipo_de_enum,String descricao, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo_de_enum= tipo_de_enum;
    }

    public void toString(Produto elemento) {
        System.out.println("Tipo: " + tipo_de_enum +"\nCodigo:" + codigo +"\nDescricao: " + descricao + "" +
                "\nValor: " + valor + "\n");
    }
}