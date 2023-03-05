package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//Ejercicio 1a,b,c
        System.out.println("\n<<<Ejercicio 1a,b,c>>>");
        int min = 5;
        int max = 14;

        System.out.println("Numeros entre "+min+" y "+max+":");

        while (min < max) {
            if (min >= 5) {
                System.out.print(min + ",");
            }
            min++;
        }
        System.out.print(max+"\n");

        System.out.println("Elija una opcion: ");
        System.out.println("1 - Mostrar pares");
        System.out.println("2 - Mostrar impares");

        Scanner reader = new Scanner(System.in);
        int nro;
        nro = reader.nextInt();
        min = 5;
        switch (nro) {
            case 1:
                System.out.println("Pares: ");
                while (min <= max) {
                    if ((min % 2) == 0) {
                        System.out.print(min + " ");
                    }
                    min++;
                }
                break;
            case 2:
                System.out.println("Impares: ");
                while (min <= max) {
                    if ((min % 2) != 0) {
                        System.out.print(min + " ");
                    }
                    min++;
                }
                break;
            default:
        }
        System.out.print("\n");

//Ejercicio 1d
        System.out.println("\n<<<Ejercicio 1d>>>");
        for ( max = 14  ; max >= 5 ; max--) {
            if (max % 2 ==0) {
                System.out.print(max + " ");
            }
        }
        System.out.print("\n");

//Ejercicio 2
        System.out.println("\n<<<Ejercicio 2>>>");
        float i;
        int v, a, inm;
        String emb;

        Scanner dato = new Scanner(System.in);
    /*
        Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
        (3,5 canastas básicas para un hogar tipo 2 según el INDEC).
         Tener 3 o más vehículos con una antigüedad menor a 5 años.
         Tener 3 o más inmuebles.
         Poseer una embarcación, una aeronave de lujo o ser titular de activos
        societarios que demuestren capacidad económica plena.”
    */
        System.out.print("Ingreso mensual total (en $): ");
        i = dato.nextInt();
        System.out.print("Cantidad de vehiculos: ");
        v = dato.nextInt();
        System.out.print("Antiguedad de los vehiculos (en anios): ");
        a = dato.nextInt();
        System.out.print("Cantidad de inmuebles: ");
        inm = dato.nextInt();
        System.out.print("Embarcacion o vehiculo de lujo (si/no): ");
        emb = dato.next();

        if ((i > 489083) || ((v > 3) && (a < 5)) || (inm > 3) || (emb.equals("si"))){
            System.out.println("\n <<<La persona pertenece al segmento de ingresos altos>>>");
        }
        else{
            System.out.println("\n <<<La persona NO pertenece a segmento de ingresos altos>>>");
        }
    }
}
