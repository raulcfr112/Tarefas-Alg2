package logicaBasica;

import java.util.Arrays;
import java.util.Scanner;

public class MenorEMaior {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int quantidadevalores = 0,posicaoMaior=0,posicaoMenor=0,maiorNumero=0,menorNumero=0;
        System.out.println("Informe quantos valores deseja:");
        quantidadevalores = n.nextInt();
        int[] vet1 = new int[quantidadevalores];
        System.out.println("Informe os valores:");
        for (int i = 0; i < quantidadevalores; i++) {
            vet1[i] = n.nextInt();
        }
        System.out.println("Vetor:" + Arrays.toString(vet1));
        for (int i = 0; i < quantidadevalores; i++) {
            for (int j = 0; j < quantidadevalores; j++) {
                if (i==0){
                    menorNumero=vet1[i];
                }
                if (vet1[j]>=vet1[i] && vet1[j]>=maiorNumero){
                    posicaoMaior=j;
                    maiorNumero=vet1[j];
                }
                if (vet1[i]<=vet1[j] && vet1[j]<=menorNumero){
                    posicaoMenor=j;
                    menorNumero=vet1[j];
                }
            }
        }
        int aux=0;
        //troca de valores do maior
        aux=vet1[quantidadevalores-1];
        vet1[quantidadevalores-1]=vet1[posicaoMaior];
        vet1[posicaoMaior]=aux;
        //troca de valores do menor
        aux=vet1[0];
        vet1[0]=vet1[posicaoMenor];
        vet1[posicaoMenor]=aux;

        System.out.println("Depois de movido o maior e o menor:" + Arrays.toString(vet1));
    }
}

