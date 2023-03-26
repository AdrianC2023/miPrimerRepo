import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Ejercicio5{
    public static void main(String[] args) throws IOException {

        System.out.println("<<<Ejercicio 2>>>\n");
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

        /*System.out.println("Elija una opcion: ");
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
        }*/

        String mensaje = "cara y cruz";
        String dicc = "abcdefghijklmnopqrstuvwxyz ";
        String cifrado = "           ";
        char[] let = mensaje.toCharArray();
        char[] d = dicc.toCharArray();
        char[] cif = cifrado.toCharArray();

        String mensaje2 = "ectcb betwa";
        String dicc2 = "abcdefghijklmnopqrstuvwxyz ";
        String cifrado2 = "           ";
        char[] let2 = mensaje2.toCharArray();
        char[] d2 = dicc2.toCharArray();
        char[] cif2 = cifrado2.toCharArray();
        System.out.print("<<<Ejercicio 3>>>\n");

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
                                //System.out.println("posicion letra: " + j + " " + d[j] + " to " + cif[i]);
                            }
                        }
                    }
                }
                System.out.println("Mensaje: " + mensaje);
                String mensajeCifrado = new String(cif);
                System.out.print("Mensaje codificado: " + mensajeCifrado + "\n");
                break;
            case 2:
                System.out.print("Ingrese desplazamiento: ");
                Scanner reader2 = new Scanner(System.in);
                int desp2 = reader2.nextInt();
                int pos2;
                for (int i = 0; i < mensaje.length(); i++) {
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
                                //System.out.println("posicion letra: " + j + " " + d2[j] + " to " + cif[i]);
                            }
                        }
                    }
                }
                System.out.println("Mensaje: " + mensaje2);
                String mensajeCifrado2 = new String(cif2);
                System.out.print("Mensaje codificado: " + mensajeCifrado2 + "\n");
                break;
            default:
        }
    }
}