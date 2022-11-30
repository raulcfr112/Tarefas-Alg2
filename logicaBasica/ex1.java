package logicaBasica;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner n = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        num1=n.nextInt();
        System.out.println("Informe o segundo número: ");
        num2=n.nextInt();
        if(num1%num2==0){
            System.out.println("São múltiplos");
        }
        else {
            System.out.println("Não são múltiplos");
        }

    }
}