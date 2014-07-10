package testPOI;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import java.io.FileOutputStream;


public class Word {

	public static void main(String[] args) {
		XWPFDocument document = new XWPFDocument();
		
		try {
			FileOutputStream output = new FileOutputStream("Awesome.docx");
			document.write(output);
			output.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
