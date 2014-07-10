package testPOI;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;

public class Word {

	public static void main(String[] args) {
		XWPFDocument document = new XWPFDocument();
		
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();
		
		run.setText("Pancakes");
		run.setText(" and Peanut Butter!");
		run.addBreak();
		run.setText("I'm hungry dude.");	
				
		
		XWPFParagraph paragraph2 = document.createParagraph();
		XWPFRun run2 = paragraph2.createRun();	
		
		run2.setText("Notice the line Bread for a new paragraph.");

		
		try {
			FileOutputStream output = new FileOutputStream("Awesome.docx");
			document.write(output);
			output.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
