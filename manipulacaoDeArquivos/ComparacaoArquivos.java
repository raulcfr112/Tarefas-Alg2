package manipulacaoDeArquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ComparacaoArquivos {
    public static void main(String[] args) {

        double acerto = 0, linhas = 0;

        Path resultado = Paths.get("src/ManipulacaoDeArquivos/gabarito.txt");
        Path gabarito = Paths.get("src/ManipulacaoDeArquivos/resultado.txt");
        Path score = Paths.get("src/ManipulacaoDeArquivos/score.txt");

        try {
            Scanner n = new Scanner(resultado.toFile());
            Scanner n1 = new Scanner(gabarito.toFile());
            FileWriter entrada = new FileWriter(score.toFile());

            while (n1.hasNextLine()) {
                linhas++;
                if (n1.nextLine().equals(n.nextLine())) {
                    entrada.write("1\n");
                    acerto++;

                } else {
                    entrada.write("0\n");

                }
            }

            entrada.write("Porcentagem de acertos: " + (acerto / linhas) * 100 + "%");
            entrada.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
