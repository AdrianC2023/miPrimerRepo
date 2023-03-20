import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        String archivo = "C:\\Users\\manu0\\Desktop\\Texto.txt";

        for(String linea : Files.readAllLines(Paths.get(archivo))) {
            System.out.println(linea);
        }

        Files.writeString(Paths.get("C:\\Users\\manu0\\Desktop\\otroTexto.txt"),"Bye\n");
        Files.writeString(Paths.get("C:\\Users\\manu0\\Desktop\\Texto.txt"),"\nBye\n");

        Path unArch = Paths.get("./ClaseNro5/recursos/algo.txt");
        System.out.println(unArch.toAbsolutePath());
        for(String linea : Files.readAllLines(unArch)) {
            System.out.println(unArch);
        }

        Path unTemporal = Files.createTempFile("nuevo",".txt");
        System.out.println(unTemporal);
    }
}

