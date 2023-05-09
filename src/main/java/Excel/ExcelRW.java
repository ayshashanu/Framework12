package Excel;
import org.apache.poi.ss.usermodel.CellType;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRW
{
    XSSFWorkbook wb;
    FileInputStream fis;
    public  ExcelRW(String xlpath) throws IOException
    {
        //open the Excel
        fis=new FileInputStream(xlpath);
        //connect the sheet
        wb=new XSSFWorkbook(fis);
    }
    // create a sheet object
    public XSSFSheet getSheet(String sheetName)
    {
        XSSFSheet sheet1=wb.getSheet(sheetName);
        return sheet1;

    }
    // RowCount
    public int getRowCount(String sheetName) { return getSheet(sheetName).getLastRowNum(); }

    // ColumnCount
    public int getColumnCount(String sheetName) { return getSheet(sheetName).getRow(1).getLastCellNum(); }

    // Read operation
    public String readCellValue(String sheetName,int row,int column)
    {
        // reading from a cell
        XSSFCell cell=getSheet(sheetName).getRow(row).getCell(column);
        String cellValue="";
        if(cell.getCellType()== CellType.STRING)
        {
            cellValue=cell.getStringCellValue();
        }
        else if (cell.getCellType()==CellType.NUMERIC)
        {
            cellValue=String.valueOf(cell.getNumericCellValue()) ;
        }
        else if (cell.getCellType()==CellType.BLANK)
        {
            cellValue="";
        }
        return cellValue;
    }
    // Write operation
    public void writeCellValue(String sheetName,int row,int column,String value)
    {
        getSheet(sheetName).getRow(row).getCell(column).setCellValue(value);
    }
    // save and close
    public void saveAndCloseWorkbook(String xlPath) throws IOException
    {
        //Save the Excel
        FileOutputStream fos=new FileOutputStream(xlPath);
        wb.write(fos);
        // close the Excel
        fis.close();
        fos.close();
    }
}





