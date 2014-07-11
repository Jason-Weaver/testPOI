package testPOI;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
	// https://poi.apache.org/apidocs/org/apache/poi/xwpf/usermodel/XWPFParagraph.html
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;

import java.io.FileOutputStream;
import java.util.ArrayList;

import java.util.Random;


public class Word {

	public static void main(String[] args) {
		String input = "How about that?";
		
		XWPFDocument document = new XWPFDocument();
		XWPFParagraph paragraph = document.createParagraph();
		ArrayList<XWPFRun> runs = new ArrayList<XWPFRun>();
		XWPFRun currentRun;
		
		String HW1 = "Impact";
		String HW2 = "Kai";
		String HW3 = "Monaco";
											// college ruled => 12pt = 12*20 = 240
		int fontSize = 50;					//    wide ruled => 14pt = 14*20 = 280
		Random rand = new Random(); 
		
		for (int i=0; i<input.length(); i++) {
			
			String letter = input.substring(i, i+1);		// read inputed character				
			// if not letter, proceed accordingly
			// check if it's an anomaly, proceed accordingly
			
			currentRun = paragraph.createRun();	
			currentRun.setText(letter);
			currentRun.setFontSize(fontSize);
			
			switch(rand.nextInt(3) + 1) {
				case 1:  currentRun.setFontFamily(HW1); break;
				case 2:  currentRun.setFontFamily(HW2); break;
				case 3:  currentRun.setFontFamily(HW3); break;
				default: System.out.println("rand not withing 1-3");
			}
			
			runs.add(currentRun);
		}
		
		try {
			FileOutputStream output = new FileOutputStream("./Awesome.docx");
			document.write(output);
			output.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Your handwritten document was created successfully.");
	}
	
}
