package cacaPalavras;

import java.util.Scanner;

public class CacaPalavras {

    static Scanner n = new Scanner(System.in);
    private static char[] palavraArray;
    private static int ctgErros = 0, ctgAcertos = 0, win = 0;
    private static String palavraSecreta;

    public static void Menu() {
        System.out.println("Informe qual sera a palavra secreta!");
        palavraSecreta = n.nextLine();
        palavraArray = palavraSecreta.toCharArray();
    }

    public static String Caracter() {
        String caracter;
        caracter = n.nextLine();
        return caracter;
    }

    public static void Checkagem(String palavraSecreta, String caracter) {
        if (palavraSecreta.contains(caracter)) {
            ChutePalavraCompleta(caracter);
            System.out.println(caracter + " esta contida na palavra secreta!");
            for (int i = 0; i < palavraArray.length; i++) {
                if (caracter.charAt(0) == palavraArray[i]) {
                    palavraArray[i] = 0;
                    ctgAcertos++;
                }
            }
        } else {
            System.out.println(caracter + " nao esta contida na palavra secreta!");
            ctgErros++;
        }
    }

    public static void ChutePalavraCompleta(String caracter) {
        if (caracter.length() == palavraArray.length) {
            for (int i = 0; i < palavraArray.length; i++) {
                if (caracter.charAt(i) == palavraArray[i] || palavraArray[i] == 0) {
                    win++;
                }
            }
        }
    }

    public static char[] getPalavraArray() {
        return palavraArray;
    }

    public static void setPalavraArray(char[] palavraArray) {
        CacaPalavras.palavraArray = palavraArray;
    }

    public static int getCtgErros() {
        return ctgErros;
    }

    public static void setCtgErros(int ctgErros) {
        CacaPalavras.ctgErros = ctgErros;
    }

    public static int getCtgAcertos() {
        return ctgAcertos;
    }

    public static void setCtgAcertos(int ctgAcertos) {
        CacaPalavras.ctgAcertos = ctgAcertos;
    }

    public static int getWin() {
        return win;
    }

    public static void setWin(int win) {
        CacaPalavras.win = win;
    }

    public static String getPalavraSecreta() {
        return palavraSecreta;
    }

    public static void setPalavraSecreta(String palavraSecreta) {
        CacaPalavras.palavraSecreta = palavraSecreta;
    }
}
