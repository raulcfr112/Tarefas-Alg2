package figurasSemHeranca;

import figurasGeometricas.Exceptions.VetorCheioException;

import java.util.Scanner;

public class Triangulo{

    static Scanner n = new Scanner(System.in);
    private int lado1,lado2,lado3,altura;

    public Triangulo(int lado1, int lado2, int lado3, int altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }

    public static String [] adicionarTriangulo(int lado1,int lado2,int lado3,int altura,String []vetor) throws VetorCheioException {
        Triangulo t1 = new Triangulo(lado1,lado2,lado3,altura);
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]==null){
//                FiguraGeometricaApp.triangulos[i]=t1;
                vetor[i]=t1.toString();
                System.out.println("Adicionado com sucesso!");
                return vetor;
            }
        }
        throw new VetorCheioException("Nao armazenado, Vetor cheio!");
    }

    @Override
    public String toString(){
        return "Triangulo: Lados: " + getLado1() + ", " + getLado2() + ", " + getLado3() + ", Altura: " + getAltura() + "" +
                ", Area: " + getArea() + ", Perimetro: " + getPerimetro();
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getArea() {
        return (lado1*altura)/2;
    }

    public float getPerimetro() {
        return lado1+lado2+lado3;
    }
}
