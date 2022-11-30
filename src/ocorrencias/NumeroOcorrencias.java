package ocorrencias;

import java.util.Scanner;

public class NumeroOcorrencias {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Informe um numero natural qualquer:");
        String m = n.next();
        System.out.println("Informe o digito que deseja saber quantas vezes ele ocorre:");
        int k=n.nextInt();
        System.out.println("O digito: " + k + " ocorre " + ocorrencias(m,k,0,0) + " vezes!");
    }
    static int ocorrencias(String m, int k, int aux, int count){
        if (aux == m.length()){
            return count;
        }else {
            if (Integer.parseInt(String.valueOf(m.charAt(aux))) == k){
                count++;
            }
            return ocorrencias(m,k,aux +1,count);
        }
    }
}