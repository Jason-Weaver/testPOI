package Tests;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Fonts {
	public static void main ( String [] args ) {
		// showFontList();
		showFontFamilies();
		// setFont();				// not sure how relevant this is; possibly only swing applications
		
	}
	
	public static void showFontList() {
		System.out.println( "\n\n\tAvailable Fonts:\n" );
		Font[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
		
		for ( int i = 0; i < fonts.length; ++i ) {
			System.out.print( fonts[i].getFontName() + " : " );
			System.out.print( fonts[i].getFamily() + " : " );
			System.out.println( fonts[i].getName() );
		}
	}  
	
	public static void showFontFamilies() {
		System.out.println( "\n\n\tAvailable Fonts:\n" );
		String[] names = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for ( int i = 0; i < names.length; ++i )
			System.out.println( names[i] );
	}
	 
	
	public static void setFont() {								//create the font
        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("/Library/Fonts/RRQuartet.ttf")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch(FontFormatException e)
        {
            e.printStackTrace();
        }

        //use the font
	}

}