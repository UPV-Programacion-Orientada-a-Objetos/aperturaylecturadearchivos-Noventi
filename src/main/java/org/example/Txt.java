package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Txt {

    void LeerTxt(String fileName) throws IOException {
        String contenido;
        FileReader f = new FileReader("C:\\Users\\edu_t\\Practica\\Excel_o_Txt\\src\\main\\excel\\"+fileName+".txt");
        BufferedReader b = new BufferedReader(f);
        while((contenido = b.readLine())!=null){
            System.out.println(contenido);
        }
        b.close();
    }
}
