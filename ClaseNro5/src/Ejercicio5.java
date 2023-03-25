import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Ejercicio5{
    public static void main(String[] args) throws IOException {

        System.out.println(args.length);
        //List<String> nros;

        for (int i = 0; i < args.length; i++) {
            System.out.println("hola");
            System.out.println(args[0]);
        }
        String unArch = "./ClaseNro5/recursos/numeros.txt";
        String cadena = null;
        for (String linea : Files.readAllLines(Paths.get(unArch))) {
            System.out.println(linea);
            cadena = linea;
            System.out.println(cadena);
        }
        System.out.println(cadena);
        int acu=0;
        int multi=1;
        for (String j : cadena.split(",")){
            int n = Integer.parseInt(j);
            System.out.println(n);
            acu=acu+n;
            multi=multi*n;
        }
        //System.out.println("suma: "+acu);
        //System.out.println("multiplicacion: "+multi);

        System.out.println("Elija una opcion: ");
        System.out.println("1 - Mostrar suma ");
        System.out.println("2 - Mostrar multiplicaion \n");

        Scanner reader = new Scanner(System.in);
        int opc;
        opc = reader.nextInt();
        switch (opc) {
            case 1:
                System.out.println("suma: "+acu);
                break;
            case 2:
                System.out.println("multiplicacion: "+multi);
                break;
            default:
        }

    }
}