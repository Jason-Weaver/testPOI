package testPOI;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Word {

	public static void main(String[] args) {
		


        
		XWPFDocument document = new XWPFDocument();
		
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();
		paragraph.setAlignment(ParagraphAlignment.CENTER);

		run.setText("Ag");	
		run.setFontSize(84);
		run.setFontFamily("PT Sans");	// must be font family name (devoid of attributes like bold)
		
		// run.setUnderline(UnderlinePatterns.DOUBLE);			 
		// run.setBold(true);									
		// run.setItalic(true);									
		// run.setStrike(true);									
		// System.out.println(run.getFontFamily());


		run.setColor("0099FF");
		
		
		try {
			FileOutputStream output = new FileOutputStream("./Awesome.docx");
			document.write(output);
			output.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
