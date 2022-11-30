package oo;

public class Circulo {
    private double area, raio;
    String nome;

    public Circulo(int raio, String nome) {
        area = Math.PI * (raio * raio);
        setArea(area);
        setRaio(raio);
        setNome(nome);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return (nome + ", raio: " + raio + ", area: " + area);
    }
}