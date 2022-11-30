package logicaBasica;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int num1,num2,num3,num4,num5,aux=0;
        Scanner n = new Scanner(System.in);
        System.out.println("Informe 5 números inteiros:");
        num1=n.nextInt();
        num2=n.nextInt();
        num3=n.nextInt();
        num4=n.nextInt();
        num5=n.nextInt();
        if (num1>aux){
            aux=num1;
        }if (num2>aux) {
            aux=num2;
        }if (num3>aux) {
            aux=num3;
        }if (num4>aux) {
            aux=num4;
        }if (num5>aux) {
            aux=num5;
        }
        System.out.println("O maior número digitado foi: "+aux);
    }
}
