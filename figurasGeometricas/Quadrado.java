package figurasGeometricas;

import figurasGeometricas.Exceptions.VetorCheioException;

public class Quadrado extends FiguraGeometrica {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public static void adicionarQuadrado(int lado) throws VetorCheioException {
        int addSucess = 0;
        Quadrado q1 = new Quadrado(lado);
        for (int i = 0; i < FiguraGeometricaApp.figurasG.length; i++) {
            if (FiguraGeometricaApp.figurasG[i] == null) {
                FiguraGeometricaApp.figurasG[i] = q1;
                System.out.println("Adicionado com sucesso!");
                addSucess++;
                break;
            }
        }
        if (addSucess == 0) {
            throw new VetorCheioException("Nao armazenado, Vetor cheio!");
        }
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado: Lado: " + getLado() + ", Area: " + getArea() + ", Perimetro: " + getPerimetro();

    }

    @Override
    public float getArea() {
        return lado * lado;
    }

    @Override
    public float getPerimetro() {
        return 4 * lado;
    }
}
