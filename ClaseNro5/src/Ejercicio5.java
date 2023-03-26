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

        String mensaje1 = "ectcb betwa";
        String dicc1 = "abcdefghijklmnopqrstuvwxyz ";
        String cifrado1 = "";
        char[] let1 = mensaje1.toCharArray();
        char[] d1 = dicc1.toCharArray();
        char[] cif1 = cifrado1.toCharArray();
        System.out.print("<<<Ejercicio 2>>>\n");

        System.out.println("Elija una opcion: ");
        System.out.println("1 - Codificacion ");
        System.out.println("2 - Decodificacion \n");
        Scanner reader1 = new Scanner(System.in);
        int opc1 = reader1.nextInt();
        switch (opc1) {
            case 1:
                System.out.print("Ingrese desplazamiento: ");
                Scanner reader = new Scanner(System.in);
                int desp = reader.nextInt();
                int pos;
                int posLim = dicc.length() - desp - 1;
                int rango = dicc.length() - 1 - posLim;
                System.out.println("Posicion limite: " + posLim + " >>> " + d[posLim]);
                System.out.println("Rango de problema: " + rango);

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
                                //System.out.println("seguir pensando");
                            }else {
                                pos = j + desp;
                                cif[i] = d[pos];
                                System.out.println("posicion letra: " + j + " " + d[j] + " to " + cif[i]);
                            }
                        }
                    }
                }
                System.out.println("Mensaje: " + mensaje);
                String mensajeCifrado = new String(cif);
                System.out.print("Mensaje codificado: " + mensajeCifrado + "\n");
                break;
            case 2:
                int pos1,p;
                for (int i = 0; i < mensaje1.length(); i++) {
                    for (int j = 0; j < dicc1.length(); j++) {
                        if (let1[i] == d1[j]) {
                            if ((let1[i] == 'b') || (let1[i] == 'a')) {
                                if (let1[i] == 'b') {
                                    cif1[i] = d1[26];
                                    //System.out.println("<"+d1[26]+">");
                                } else {
                                    cif1[i] = d1[25];
                                }
                            } else {
                                //p=j;
                                //System.out.println("posicion "+p);
                                pos1 = j - 2;
                                cif1[i] = d1[pos1];
                            }
                        }
                    }
                }
                System.out.println("Mensaje: "+mensaje1);
                String mensajeCifrado1 = new String(cif1);
                System.out.print("Mensaje decodificado: "+mensajeCifrado1+"\n");
                break;
            default:
        }
    }
}