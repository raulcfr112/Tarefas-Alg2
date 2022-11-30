package figurasSemHeranca;

import figurasGeometricas.Exceptions.VetorCheioException;

import java.util.Scanner;

public class Circulo{

    static Scanner n = new Scanner(System.in);
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public static String[] adicionarCirculo(float raio, String[] figuras) throws VetorCheioException {
        Circulo c1 = new Circulo(raio);
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i]== null) {
//                FiguraGeometricaApp.circulos[i] = c1;
                figuras[i]=c1.toString();
                System.out.println("Adicionado com sucesso!");
                return figuras;
            }
        }
        throw new VetorCheioException("Nao armazenado, Vetor cheio!");
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo: Raio: " + getRaio() + ", Area: " + getArea() + ", Perimetro: " + getPerimetro();

    }

    public float getArea() {
        return (float) (3.14 * (raio * raio));
    }

    public float getPerimetro() {
        return (float) ((2 * 3.14) * raio);
    }
}
