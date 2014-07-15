package testPOI;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 
import java.io.FileOutputStream;
 
public class Excel {
       
        public static void main(String[] args) {
                Workbook workbook = new HSSFWorkbook();
               
                try {
                        FileOutputStream output = new FileOutputStream("TotallyRad.xls");
                        workbook.write(output);
                        output.close();
                } catch(Exception e) {
                        e.printStackTrace();
                }
                System.out.println("Your empty Excel document was created successfully.");
        }
}