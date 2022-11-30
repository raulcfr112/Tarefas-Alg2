package leituraTriangulo;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LeituraTriangulo {
    public static void main(String[] args) {
        FileWriter myWriter;
        Path triangulos = Paths.get("src/files/triangulos.txt");
        Path solucao = Paths.get("src/files/solucaoTriangulos.txt");
        try {
            Scanner myReader = new Scanner(triangulos.toFile());
            myWriter = new FileWriter(solucao.toFile());
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Triangulo t1 = new Triangulo(Integer.parseInt(data.split(" ")[0]), Integer.parseInt(data.split(" ")[1]), Integer.parseInt(data.split(" ")[2]));
                if (t1.isTriangulo()) {
                    myWriter.write(t1.isTipo() + "\n");
                } else {
                    myWriter.write("NAO-TRIANGULO" + "\n");
                }
            }
            myWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}