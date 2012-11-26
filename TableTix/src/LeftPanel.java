import java.util.ArrayList;

import android.R.integer;
import android.webkit.WebSettings.TextSize;
import processing.core.PFont;
import processing.core.PImage;
import vialab.SMT.ButtonZone;
import vialab.SMT.ImageZone;
import vialab.SMT.TextZone;
import vialab.SMT.Zone;


public class LeftPanel extends Zone{
	
	int ShowTimeNum;

	public LeftPanel()
	{
	   super("LeftMain", 0 , Global.progressBarHeight + 1, Global.leftPanelWidth+1, 768);
	   Global.backgroupImage = Global.applet.loadImage("..//Image//Back Steel.png");
	}
	


	@Override
	public void draw() {
		super.draw(); 

		image(Global.backgroupImage,0,0, width, height); 
		if(Global.currentMovie != null)
		{
			noStroke();
			drawFuzzyRectangle(68, 50, 160, 227, 10, 20);
			image(Global.currentMovie.poster, 78 , 60,140, 207);
			fill(255);
			textAlign(CENTER);
			textSize(26);
			text(Global.currentMovie.title,50,285,196,60);
			
			if(Global.currentScreen == 1 || Global.currentScreen == 0 )
			{				
				textAlign(LEFT);
				textSize(13);
				text(Global.currentMovie.cast,30,348,236,30);	
				text(Global.currentMovie.genre,30,393,236,13);
				text("Duration: " + Global.currentMovie.duration,30,407,236,13);
				text("IMDB Rating: " + Global.currentMovie.imdbRating + ", MPAA Rating: " + Global.currentMovie.mpaaRating,30,421,236,13);
				text(Global.currentMovie.synopsis,30,453,236,190);
				fill(128,182,15);
				rect(0, height - 120, width, 120);
				
				fill(0);
				textAlign(LEFT);
				textSize(18);
				text("Select a Showtime:",10,660,300,18);

			}
			else 
			{
				if(Global.currentScreen != 4)
				{
					fill(99, 228, 21);
					rect(0, 390, width, 186);
					
					
					Global.orderSummary = new ArrayList<String>();
					Global.orderSummaryLineCost = new ArrayList<String>();
					Global.orderSummary.add(Global.currentMovie.title); 
					Global.orderSummary.add(Global.currentShowTime);
					Global.orderSummary.add(" "); 
					Global.orderSummaryLineCost.add(" "); 
					Global.orderSummaryLineCost.add(" "); 
					Global.orderSummaryLineCost.add(" "); 
					Global.OrderTotal = 0;
					if(Global.generalTicketQuantity != 0)
					{
						Global.orderSummary.add(Global.generalTicketQuantity + " General Tickets");
						Global.orderSummaryLineCost.add("$" +  String.format("%.2f", Global.generalTicketPrice*Global.generalTicketQuantity));
						Global.OrderTotal += Global.generalTicketPrice*Global.generalTicketQuantity;
					}
					if(Global.childTicketQuantity != 0)
					{
						Global.orderSummary.add(Global.childTicketQuantity + " Child Tickets");
						Global.orderSummaryLineCost.add("$" + String.format("%.2f", Global.childTicketPrice*Global.childTicketQuantity));
						Global.OrderTotal += Global.childTicketPrice*Global.childTicketQuantity;
					}
					if(Global.seniorTicketQuantity != 0)
					{
						Global.orderSummary.add(Global.seniorTicketQuantity + " Senior Tickets");
						Global.orderSummaryLineCost.add("$" + String.format("%.2f", Global.seniorTicketPrice*Global.seniorTicketQuantity));
						Global.OrderTotal += Global.seniorTicketPrice*Global.seniorTicketQuantity;
					}
					
					Global.orderSummaryString = new String();
					Global.orderSummaryLineCostString = new String();
					for(int i = 0; i < Global.orderSummary.size(); ++i)
					{
						Global.orderSummaryString += Global.orderSummary.get(i) + "\r\n";
						Global.orderSummaryLineCostString += Global.orderSummaryLineCost.get(i) + "\r\n";
					}
					
					fill(0);
					textAlign(LEFT);
					textSize(16);
					text(Global.orderSummaryString, 10, 395, 200, 160);
					textAlign(RIGHT);
					text(Global.orderSummaryLineCostString, 170, 395, width - 180, 160);
					textAlign(LEFT);
					fill(255);
					textSize(24);
					text("Total:", 10, 585, 170, 30);	
					textAlign(RIGHT);
					text("$" + String.format("%.2f", Global.OrderTotal), 170, 585, width - 180, 30);
					rect(0, 615, width, 2);

				}
				
			}
		}
		else 
		{
			fill(255);
			textAlign(CENTER);
			textFont(Global.fontCent, 26);
			text("Please Select The Movie You Would Like To See",45,330,200,400);	
		}
	}	
	
	
	
	
	
	
	
	// Draw a rectangle which can have differently colored edges
	// @param x X coordinate of the top-left corner of the rectangle (pixels)
	// @param y X coordinate of the top-left corner of the rectangle (pixels)
	// @param widt Width of the rectangle (pixels)
	// @param heigh Height of the rectangle (pixels)
	// @param tlcolor Color of the top-left rectangle corner
	// @param trcolor Color of the top-right rectangle corner
	// @param brcolor Color of the bottom-right rectangle corner
	// @param blcolor Color of the bottom-left rectangle corner
	// 
	private void makeRectangle(int x, int y, int widh, int heigh, int tlcolor, int trcolor, int brcolor, int blcolor) 
	{
	  beginShape(POLYGON);
	    fill(tlcolor);
	      vertex(x, y);
	    fill(trcolor);
	      vertex(x+widh, y);
	    fill(brcolor);
	      vertex(x+widh, y+heigh);
	    fill(blcolor);
	      vertex(x, y+heigh);
	  endShape(CLOSE);
	}
	 
	// Draw a gradient corner by making triangles
	// @param x X coordinate of the center of the semicircle (pixels)
	// @param y Y coordinate of the center of the semicircle (pixels)
	// @param rad Radius of the semicircle (pixels)
	// @param divisions Number of triangle divisions to make (more=smoother)
	// @param quadrant Which quadrant to draw in 
	// @param insideColor Color to use for the center of the semicircle
	// @param outsideColor Color to use for the outside of the semicircle
	void makeGradientCorner(int x, int y, int rad, int divisions, int quadrant, int insideColor, int outsideColor) 
	{
	  beginShape(TRIANGLES); 
	    for(float angle = quadrant*PI/2;
	        angle < (quadrant + 1)*PI/2 - .001;
	        angle += PI/divisions/2) {
	      fill(insideColor);
	        vertex(x, y);
	      fill(outsideColor);
	        vertex(x+Global.applet.cos(angle)*rad,                y-Global.applet.sin(angle)*rad);
	        vertex(x+Global.applet.cos(angle+PI/divisions/2)*rad, y-Global.applet.sin(angle+PI/divisions/2)*rad);
	    }
	  endShape(CLOSE);
	}
	 
	// Draw a fuzzy rectangle at the specified position
	// @param x X coordinate of the top-left corner of the rectangle (pixels)
	// @param y X coordinate of the top-left corner of the rectangle (pixels)
	// @param widt Width of the rectangle (pixels)
	// @param heigh Height of the rectangle (pixels)
	// @param radius Radius of the fuzzing (pixels)
	// @param fgcolor color of the rectangle
	void drawFuzzyRectangle(int x, int y, int widt, int heigh,
	                        int rad, int fgcolor) {
	  // Handle the case where the radius is too big, by clipping it to 1/2 the max height or width.
	  int max_rad = (int)Global.applet.min(widt/2, heigh/2);
	  rad = Global.applet.min(rad, max_rad);
	 
	  // Uncomment this to see how the gradients are being drawn
	  //stroke(0);
	 
	  int bgcolor = Global.applet.color(100,100,100,0);
	  makeRectangle(x+rad, y+rad,        widt-2*rad, heigh-2*rad, fgcolor, fgcolor, fgcolor, fgcolor);
	  makeRectangle(x+rad, y,            widt-2*rad, rad,   bgcolor, bgcolor, fgcolor, fgcolor);
	  makeRectangle(x, y+rad,            rad, heigh-2*rad,  bgcolor, fgcolor, fgcolor, bgcolor);
	  makeRectangle(x+rad, y+rad+heigh-2*rad,  widt-2*rad, rad,   fgcolor, fgcolor, bgcolor, bgcolor);
	  makeRectangle(x+widt-rad, y+rad,   rad, heigh-2*rad,  fgcolor, bgcolor, bgcolor, fgcolor);
	  makeGradientCorner(x+widt-rad, y+rad,       rad, 8,  0,   fgcolor, bgcolor);
	  makeGradientCorner(x+rad, y+rad,            rad, 8,  1,   fgcolor, bgcolor);
	  makeGradientCorner(x+rad, y+heigh-rad,      rad, 8,  2,   fgcolor, bgcolor);
	  makeGradientCorner(x+widt-rad, y+heigh-rad, rad, 8,  3,   fgcolor, bgcolor);
	}

	
}
