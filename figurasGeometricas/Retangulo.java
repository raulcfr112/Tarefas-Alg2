package figurasGeometricas;

import figurasGeometricas.Exceptions.VetorCheioException;

public class Retangulo extends FiguraGeometrica {

    private int base, altura;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public static void adicionaRetangulo(int base, int altura) throws VetorCheioException {
        int addSucess = 0;
        Retangulo r1 = new Retangulo(base, altura);
        for (int i = 0; i < FiguraGeometricaApp.figurasG.length; i++) {
            if (FiguraGeometricaApp.figurasG[i] == null) {
                FiguraGeometricaApp.figurasG[i] = r1;
                System.out.println("Adicionado com sucesso!");
                addSucess++;
                break;
            }
        }
        if (addSucess == 0) {
            throw new VetorCheioException("Nao armazenado, Vetor cheio!");
        }
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Retangulo: Base: " + getBase() + ", Altura: " + getAltura() + ", Area: " + getArea() + ", Perimetro: " + getPerimetro();

    }

    @Override
    public float getArea() {
        return base * altura;
    }

    @Override
    public float getPerimetro() {
        return 2 * (base + altura);
    }

}
