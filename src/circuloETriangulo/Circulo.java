package circuloETriangulo;

public class Circulo {
    private int raio;
    private double area;
    private String nomeCirculo;

    public Circulo(String nomeCirculo, int raio){
        area=Math.PI*(raio*raio);
        setArea(area);
        this.nomeCirculo=nomeCirculo;
        this.raio=raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getNomeCirculo() {
        return nomeCirculo;
    }

    public void setNomeCirculo(String nomeCirculo) {
        this.nomeCirculo = nomeCirculo;
    }

    public String toString() {
        return (nomeCirculo + ", raio: " + raio + ", area: " + area);
    }
}