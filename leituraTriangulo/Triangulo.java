package leituraTriangulo;

public class Triangulo {
    private int lado1,lado2,lado3;
    private String tipo;

    public Triangulo(int lado1,int lado2,int lado3){
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }

    public boolean isTriangulo() {
        return (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2);
    }

    public String isTipo() {
        if (lado1 == lado2 && lado1 == lado3) {
            return "EQUILATERO";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "ISOSCELES";
        } else {
            return "ESCALENO";
        }
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
