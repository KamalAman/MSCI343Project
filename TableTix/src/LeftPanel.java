import processing.core.PFont;
import processing.core.PImage;
import vialab.SMT.ButtonZone;
import vialab.SMT.ImageZone;
import vialab.SMT.TextZone;
import vialab.SMT.Zone;


public class LeftPanel extends Zone{
	PImage backgroupImage;
	PFont largeFont;
	public LeftPanel()
	{
	   super("LeftMain", 0 , Global.progressBarHeight, Global.leftPanelWidth, Global.panelHeight);
	   backgroupImage = Global.applet.loadImage("..//Image//Back Steel.png");
	   largeFont = Global.applet.createFont("Century Gothic", 26, true);
	}
	


	@Override
	public void draw() {
		super.draw(); 

		if(Global.currentMovieTitle == "")
		{
		}
		else 
		{
			image(backgroupImage,0,0, width, height); 
			fill(255);
			textAlign(CENTER);
			textFont(largeFont);
			text("Please Select The Movie You Would Like To See",45,310,200,400);	
		}
	}	
	
}
