package figurasGeometricas;

import figurasGeometricas.Exceptions.VetorCheioException;

import java.util.Scanner;

public class Circulo extends FiguraGeometrica {

    static Scanner n = new Scanner(System.in);
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public static void adicionarCirculo(float raio) throws VetorCheioException {
        int addSucess = 0;
        Circulo c1 = new Circulo(raio);
        for (int i = 0; i < FiguraGeometricaApp.figurasG.length; i++) {
            if (FiguraGeometricaApp.figurasG[i] == null) {
                FiguraGeometricaApp.figurasG[i] = c1;
                System.out.println("Adicionado com sucesso!");
                addSucess++;
                break;
            }
        }
        if (addSucess == 0) {
            throw new VetorCheioException("Nao armazenado, Vetor cheio!");
        }
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

    @Override
    public float getArea() {
        return (float) (3.14 * (raio * raio));
    }

    @Override
    public float getPerimetro() {
        return (float) ((2 * 3.14) * raio);
    }
}
