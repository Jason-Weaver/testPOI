package testPOI;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.Borders;

import java.io.FileOutputStream;

public class Word {

	public static void main(String[] args) {
		XWPFDocument document = new XWPFDocument();
		
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();
		paragraph.setAlignment(ParagraphAlignment.CENTER);
		paragraph.setIndentationHanging(1000);
		paragraph.setBorderTop(Borders.BASIC_BLACK_DASHES);
		paragraph.setBorderBottom(Borders.BASIC_BLACK_DASHES);
		paragraph.setSpacingAfter(1000);							// 20 = 1pt of font?
		
		run.setText("Pancakes"); 
		run.setText(" and Peanut Butter! ");
		run.addBreak();
		run.setText("I'm hungry dude. I'm hungry dude. I'm hungry dude. I'm hungry dude. I'm hungry dude."
				+ "I'm hungry dude. I'm hungry dude. I'm hungry dude. I'm hungry dude. I'm hungry dude.");	
		
		XWPFParagraph paragraph2 = document.createParagraph();
		XWPFRun run2 = paragraph2.createRun();
		// paragraph2.setPageBreak(true); couldn't get this to work
		
		run2.setText("Notice the line break for a new paragraph.");

		
		try {
			FileOutputStream output = new FileOutputStream("Awesome.docx");
			document.write(output);
			output.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
