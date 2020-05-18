package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

    void LeerExcel(String fileName){
        String rutaArchivo = "C:\\Users\\edu_t\\Practica\\Excel_o_Txt\\src\\main\\excel\\" + fileName + ".xlsx";

        try (FileInputStream file = new FileInputStream(new File(rutaArchivo))) {
            XSSFWorkbook worbook = new XSSFWorkbook(file);
            XSSFSheet sheet = worbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            Row row;

            while (rowIterator.hasNext()) {
                row = rowIterator.next();

                Iterator<Cell> cellIterator = row.cellIterator();
                Cell cell;
                while (cellIterator.hasNext()) {
                    cell = cellIterator.next();
                    System.out.print(cell.getStringCellValue()+" | ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
