package figurasSemHeranca;

import figurasGeometricas.Exceptions.VetorCheioException;


public class Retangulo{

    private int base, altura;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public static String[] adicionaRetangulo(int base, int altura, String[] figuras) throws VetorCheioException {
        Retangulo r1 = new Retangulo(base, altura);
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] == null) {
//                FiguraGeometricaApp.retangulos[i] = r1;
                figuras[i]=r1.toString();
                System.out.println("Adicionado com sucesso!");
                return figuras;
            }
        }
        throw new VetorCheioException("Nao armazenado, Vetor cheio!");
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


    public float getArea() {
        return base * altura;
    }


    public float getPerimetro() {
        return 2 * (base + altura);
    }

}
