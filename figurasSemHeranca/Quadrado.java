package figurasSemHeranca;

import figurasGeometricas.Exceptions.VetorCheioException;
public class Quadrado{
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public static String[] adicionarQuadrado(int lado, String[] figuras) throws VetorCheioException {
        Quadrado q1 = new Quadrado(lado);
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] == null) {
//                FiguraGeometricaApp.quadrados[i] = q1;
                figuras[i]=q1.toString();
                System.out.println("Adicionado com sucesso!");
                return figuras;
            }
        }
        throw new VetorCheioException("Nao armazenado, Vetor cheio!");
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

    public float getArea() {
        return lado * lado;
    }


    public float getPerimetro() {
        return 4 * lado;
    }
}
