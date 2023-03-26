import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Ejercicio5{
    public static void main(String[] args) throws IOException {

        System.out.println("<<<Ejercicio 2>>>");

        String unArch = "./ClaseNro5/recursos/numeros.txt";
        String cadena = null;
        for (String linea : Files.readAllLines(Paths.get(unArch))) {
            //System.out.println(linea);
            cadena = linea;
            System.out.println("Numeros del archivo: "+cadena);
        }

        int acu=0;
        int multi=1;
        for (String j : cadena.split(",")){
            int n = Integer.parseInt(j);
            //System.out.println(n);
            acu=acu+n;
            multi=multi*n;
        }

        System.out.println("1 - Mostrar suma ");
        System.out.println("2 - Mostrar multiplicacion ");
        System.out.print("Elija una opcion: ");

        Scanner r = new Scanner(System.in);
        int opc;
        opc = r.nextInt();
        switch (opc) {
            case 1:
                System.out.println("suma: "+acu);
                break;
            case 2:
                System.out.println("multiplicacion: "+multi);
                break;
            default:
        }

        System.out.print("<<<Ejercicio 3>>>\n");

        String dicc = "abcdefghijklmnopqrstuvwxyz ";
        char[] d = dicc.toCharArray();

        String dicc2 = "abcdefghijklmnopqrstuvwxyz ";
        char[] d2 = dicc2.toCharArray();

        System.out.println("1 - Codificacion ");
        System.out.print("2 - Decodificacion \n");
        System.out.print("Elija una opcion: ");
        Scanner reader1 = new Scanner(System.in);
        int opc1 = reader1.nextInt();
        switch (opc1) {
            case 1:
                System.out.print("Ingrese desplazamiento: ");
                Scanner reader = new Scanner(System.in);
                int desp = reader.nextInt();
                String archIn = "./ClaseNro5/recursos/entrada.txt";
                String mensaje = null;
                String cifrado = "           ";

                for (String linea : Files.readAllLines(Paths.get(archIn))) {
                    System.out.println("Mensaje del archivo de entrada: "+(mensaje = linea));
                }
                char[] let = mensaje.toCharArray();
                char[] cif = cifrado.toCharArray();

                int pos;
                for (int i = 0; i < mensaje.length(); i++) {
                    for (int j = 0; j < dicc.length(); j++) {
                        if (let[i] == d[j]) {
                            if ((let[i] == ' ') || (j+desp>26)) {
                                if (j+desp>26){
                                    cif[i] = d[j+desp-dicc.length()]; //2-1-1
                                } else {
                                    if (let[i] == ' '){
                                        cif[i] = d[desp-1]; //2-1
                                    }
                                }
                            }else {
                                pos = j + desp;
                                cif[i] = d[pos];
                            }
                        }
                    }
                }
                String mensajeCifrado = new String(cif);
                Files.writeString(Paths.get("./ClaseNro5/recursos/salida.txt"),mensajeCifrado);
                String archOut = "./ClaseNro5/recursos/salida.txt";

                for (String linea : Files.readAllLines(Paths.get(archOut))) {
                    System.out.println("Mensaje del archivo de salida: "+(mensajeCifrado));
                }
                break;
            case 2:
                System.out.print("Ingrese desplazamiento: ");
                Scanner reader2 = new Scanner(System.in);
                int desp2 = reader2.nextInt();
                String archOut2 = "./ClaseNro5/recursos/salida.txt";
                String mensaje2 = "           ";
                String cifrado2 = "           ";

                for (String linea : Files.readAllLines(Paths.get(archOut2))) {
                    System.out.println("Mensaje del archivo de salida: "+(mensaje2 = linea));
                }

                char[] let2 = mensaje2.toCharArray();
                char[] cif2 = cifrado2.toCharArray();

                int pos2;
                for (int i = 0; i < mensaje2.length(); i++) {
                    for (int j = 0; j < dicc2.length(); j++) {
                        if (let2[i] == d2[j]) {
                            if ((let2[i] == 'a') || (j-desp2<0)) {
                                if (j-desp2<0){
                                    cif2[i] = d2[j-desp2+dicc.length()];
                                } else {
                                    if (let2[i] == 'a'){
                                        cif2[i] = d2[dicc2.length()-desp2];
                                    }
                                }
                            }else {
                                pos2 = j - desp2;
                                cif2[i] = d2[pos2];
                            }
                        }
                    }
                }
                String mensajeCifrado2 = new String(cif2);
                Files.writeString(Paths.get("./ClaseNro5/recursos/entrada.txt"),mensajeCifrado2);
                String archIn2 = "./ClaseNro5/recursos/entrada.txt";

                for (String linea : Files.readAllLines(Paths.get(archIn2))) {
                    System.out.println("Mensaje del archivo de entrada: "+(mensajeCifrado2));
                }
                break;
            default:
        }
    }
}