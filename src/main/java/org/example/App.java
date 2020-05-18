package org.example;

import java.io.IOException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws IOException {
        Scanner teclado = new Scanner(System.in);

        Eleccion a;
        Excel iniciadorExcel;
        Txt iniciadorTxt;

        a = new Eleccion();
        int respuesta;
        String nombreDelArchivo;


        do{
            respuesta = a.TextoDeEleccion();
            if(respuesta <1 || respuesta > 2){

            }
        }while(respuesta<1||respuesta>2);


        if(respuesta==1){
            iniciadorExcel = new Excel();
            System.out.println("Ingrese el nombre del archivo excel el cual quiere abrir");
            nombreDelArchivo = teclado.nextLine();
            iniciadorExcel.LeerExcel(nombreDelArchivo);
        }


        if(respuesta==2){
            iniciadorTxt = new Txt();
            System.out.println("Ingrese el nombre del archivo de texto el cual quiere abrir");
            nombreDelArchivo = teclado.nextLine();
            iniciadorTxt.LeerTxt(nombreDelArchivo);
        }
    }
}
