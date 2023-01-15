package org.example.Utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExelReader {
    FileInputStream excelFile;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    String filePath = "C:\\Users\\User1\\IdeaProjects\\FinalB\\data\\test-data.xlsx";
    String sheetName = "Feuil1";

//    public ExelReader(String filePath, String sheetName){
//        this.filePath = filePath;
//        this.sheetName = sheetName;
//    }

    public String getDataFromCell(int row, int column) {
        String value = null;
        try {
            excelFile = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(excelFile);
            sheet = workbook.getSheet(sheetName);
            value = sheet.getRow(row).getCell(column).getStringCellValue();
            excelFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return value;
    }

    public List<String> getEntireColumnData(int rowStart, int column) {
        List<String> columnData = new ArrayList<>();
        try {
            excelFile = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(excelFile);
            sheet = workbook.getSheet(sheetName);
            for (int i = rowStart; i <= sheet.getLastRowNum(); i++) {
                columnData.add(sheet.getRow(i).getCell(column).getStringCellValue());
            }
            excelFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return columnData;
    }

    public String getDataForGivenHeaderAndKey(String header, String key) {
        String value = null;
        int i = 0;
        while (getDataFromCell(0, i) != null) {
            if (getDataFromCell(0, i).equalsIgnoreCase(header)) {
                for (int j = 0; j < getEntireColumnData(1, i).size(); j++) {
                    if (getEntireColumnData(1, i).get(j).equalsIgnoreCase(key)) {
                        value = getEntireColumnData(1, i + 1).get(j);
                    }
                }
                break;
            }
            i++;
        }
        return value;
    }


}
