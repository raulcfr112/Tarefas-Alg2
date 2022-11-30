package produto;

public class ProdutoDB {
    static Produto[] vetorP = new Produto[3];

    static public void cadastro(Produto p1) {
        int auxPreencher=0;
        for (Produto elemento : vetorP) {
            if (elemento != null) {
                if (elemento.codigo == p1.codigo && auxPreencher==0) {
                    auxPreencher++;
                    System.out.println("Codigo ja cadastrado, insira outro!");
                    break;
                }
                if (auxPreencher==0){
                    for (int i = 0; i < vetorP.length; i++) {
                        if (vetorP[i]==null){
                            vetorP[i]=p1;
                            System.out.println("Produto armazenado!");
                            auxPreencher++;
                            break;
                        }
                    }
                }
            }else {
                if (auxPreencher == 0) {
                    for (int i = 0; i < vetorP.length; i++) {
                        if (vetorP[i] == null) {
                            vetorP[i] = p1;
                            System.out.println("Produto armazenado!");
                            auxPreencher++;
                            break;
                        }
                    }
                }
            }
        }if (auxPreencher==0){
            System.out.println("Erro! Armazem de produtos cheio!");
        }
    }
    static public void excluirCadastro(int codigo){
        int produtoEncontrado=0;

        for (int i = 0; i < vetorP.length; i++) {
            if (vetorP[i]!=null){
                if (vetorP[i].codigo==codigo){
                    vetorP[i]=null;
                    produtoEncontrado++;
                    break;
                }
            }
        }
        if (produtoEncontrado>0){
            System.out.println("Produto de codigo: " + codigo + " excluido!");
        }else {
            System.out.println("Error! Produto nao encontrado!");
        }
    }

    static public void listarProdutos(Tipo tipo){
        int achou=0;
        for (Produto elemento:vetorP) {
            if (elemento!=null) {
                if (elemento.tipo_de_enum == tipo) {
                    achou++;
                    elemento.toString(elemento);
                }
            }
        }
        if (achou==0){
            System.out.println("Nao foi encontrado nenhum produto do tipo: " + tipo );
        }
    }
}