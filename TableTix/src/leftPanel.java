import processing.core.PFont;
import processing.core.PImage;
import vialab.SMT.ButtonZone;
import vialab.SMT.ImageZone;
import vialab.SMT.TextZone;
import vialab.SMT.Zone;


public class leftPanel {
	PImage backgroupImage;
	PFont largeFont;
	public leftPanel()
	{
	   
		backgroupImage = Global.applet.loadImage("..//Image//Back Steel.png");
		
		largeFont = Global.applet.createFont("Century Gothic", 26, true);
	}
	



	public void chkDraw(Zone z)
	{

		z.image(backgroupImage,0,0, z.width, z.height); 
		z.fill(255);
		z.textAlign(z.CENTER);
		z.textFont(largeFont);
		z.text("Please Select The Movie You Would Like To See",45,260,200,400);
		if(Global.currentMovieTitle != "")
		{
		}
		else 
		{    
			
		}
	}	

}
