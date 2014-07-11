package testPOI;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;

import java.io.FileOutputStream;

public class Word {

	public static void main(String[] args) {
		XWPFDocument document = new XWPFDocument();
		
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();
		paragraph.setAlignment(ParagraphAlignment.CENTER);

		run.setText("Ag");	
		run.setFontSize(84);
		run.setFontFamily("Baskerville");					// don't add .ttc
			// Fonts that Worked: Futura, Kefa, Telugu MN, Verdana, Papyrus, Noteworthy, Baskerville
			// Fonts that didn't: PTSans, Sana, Corsiva, Ariel, Baoli
		// run.setUnderline(UnderlinePatterns.DOUBLE);			works 
		// run.setBold(true);									works
		// run.setItalic(true);									works
		// run.setStrike(true);									works


		run.setColor("0099FF");
		
		
		try {
			FileOutputStream output = new FileOutputStream("Awesome.docx");
			document.write(output);
			output.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
