package logicaBasica;

public class Relogio {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            System.out.println();
            System.out.printf(i + " horas. ");
            for (int k = 0; k <= 60; k++) {
                System.out.println();
                System.out.printf(k + " min. ");
                for (int j = 0; j <= 60; j++) {
                    System.out.printf(j + " seg. ");
                }
            }
        }
    }
    //professor, fiz até 2 horas para não poluir muito o console
}
