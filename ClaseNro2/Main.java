package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//Ejericio 1a
        String palabra = "computadora";
        char letra = 'a';
        int l, c;
        System.out.println("\n<<<Ejercicio 1a>>>");
        System.out.println("Palabra: "+palabra);
        l = palabra.length();
        System.out.println("Longitud de la palabra: "+l);

        char[] letras =  palabra.toCharArray();

        c=0;
        for (int i = 0; i<palabra.length(); i++) {
            if(letras[i] == letra){
                c++;
            }
        }
        System.out.println("La letra 'a' aparece "+c+" veces\n");

//Ejercicio 1b
        System.out.println("<<<Ejercicio 1b>>>");
        int[] vec = {9,3,5};
        int min, max, indice, aux;
        //int cm = 0;

        System.out.println("Numeros: "+vec[0]+" "+vec[1]+" "+vec[2]);
        System.out.println("Elija un opcion:");
        System.out.println("1 - Orden ascendente");
        System.out.println("2 - Orden descendente");

        Scanner reader = new Scanner(System.in);
        int opc;
        opc = reader.nextInt();

        switch (opc){
            case 1:
                for (int i=0; i<vec.length-1; i++){
                    min = vec[i];
                    indice = i;
                    for (int j = i+1; j<vec.length; j++){
                        if (vec[j] < min){
                            min = vec[j];
                            indice = j;
                        }
                    }
                    if (min < vec[i]){
                        aux = vec[i];
                        vec[i] = min;
                        vec[indice] = aux;
                        //cm++;
                    }

                }
                System.out.println(vec[0]+" "+vec[1]+" "+vec[2]+"\n");
                break;
            case 2:
                for (int i=0; i<vec.length-1; i++){
                    max = vec[i];
                    indice = i;
                    for (int j = i+1; j<vec.length; j++){
                        if (vec[j] > max){
                            max = vec[j];
                            indice = j;
                        }
                    }
                    if (max > vec[i]){
                        aux = vec[i];
                        vec[i] = max;
                        vec[indice] = aux;
                        //cm++;
                    }
                }
                System.out.println(vec[0]+" "+vec[1]+" "+vec[2]+"\n");
                break;
            default:
        }
//Ejercicio 1c
        int[] nros =  {4,8,10};
        int x, sum;
        System.out.print("<<<Ejercicio 1c>>>\n");
        x = 4;
        sum = 0;
        for (int i=0; i< nros.length; i++){
            if (nros[i] > x){
                sum = sum+nros[i];
            }
        }
        System.out.println("Numeros: "+nros[0]+" "+nros[1]+" "+nros[2]);
        System.out.println("Numero: "+x);
        System.out.println("Suma de los numeros mayores a "+x+" es igual a: "+sum+"\n");

        String mensaje = "cara y cruz";
        String dicc = "abcdefghijklmnopqrstuvwxyz ";
        String cifrado = "           ";

//Ejercicio 2
        char[] let = mensaje.toCharArray();
        char[] d = dicc.toCharArray();
        char[] cif = cifrado.toCharArray();
        System.out.print("<<<Ejercicio 2>>>\n");
        int pos;
        for(int i = 0; i<mensaje.length(); i++){
            for (int j = 0; j<dicc.length(); j++){
                if (let[i] == d[j]){
                    if ((let[i] == ' ') || (let[i] == 'z')){
                        if (let[i] == 'z'){
                            cif[i] = d[0];
                        } else {
                            cif[i] = d[1];
                        }
                    } else {
                        pos = j + 2;
                        cif[i] = d[pos];
                    }
                }
            }
        }
        System.out.println("Mensaje: "+mensaje);
        String mensajeCifrado = new String(cif);
        System.out.print("Mensaje cifrado: "+mensajeCifrado+"\n");
    }
}
