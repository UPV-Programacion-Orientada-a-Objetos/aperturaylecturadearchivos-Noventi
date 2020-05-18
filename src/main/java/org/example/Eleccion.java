package org.example;

import java.util.Scanner;

public class Eleccion {

    int TextoDeEleccion(){
        Scanner teclado = new Scanner(System.in);
        int respuesta;
        System.out.println( "Elija el metodo en el que cargara el archivo\n 1) Excel \n 2) Archivo de Texto" );
        respuesta = teclado.nextInt();
        return respuesta;
    }
}
