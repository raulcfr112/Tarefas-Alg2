package cacaPalavras;

public class CacaPalavrasApp {

    public static void main(String[] args) {

        CacaPalavras.Menu();

        do {
            System.out.println("Informe uma letra ou a palavra que acha que seja:(Letras repetidas nao serao contabilizadas!):");
            CacaPalavras.Checkagem(CacaPalavras.getPalavraSecreta(), CacaPalavras.Caracter());
        } while (CacaPalavras.getCtgErros() != 5 && CacaPalavras.getCtgAcertos() != CacaPalavras.getPalavraSecreta().length() && CacaPalavras.getWin() != CacaPalavras.getPalavraSecreta().length());
        if (CacaPalavras.getCtgErros() == 5) {
            System.out.println("Voce errou 5 vezes, Game Over!");
        } else {
            System.out.println("Parabens, voce descobriu a palavra secreta " + CacaPalavras.getPalavraSecreta() + "!");
        }
    }
}