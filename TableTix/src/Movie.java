
import java.awt.List;
import java.util.*;
import processing.opengl.*;
import javax.swing.Box.Filler;

import android.R.drawable;
import android.R.integer;
import android.util.Pair;
import processing.core.PFont;
import processing.core.PImage;
import sun.net.www.content.audio.x_aiff;
import vialab.SMT.*;


public class Movie extends Zone{
	public PImage poster; 
	public String title;
	public String cast;
	public String genre;
	public String duration;
	public String imdbRating;
	public String mpaaRating;
	public String mpaaWarningMessage;
	public String synopsis;
	public int currentMovie;
	public ArrayList<showTime> showTimes;
	public int x = 0;
	public int y = 0;
	int Y_AXIS = 1;
	int X_AXIS = 2;
	PFont movieFont;
	int backgroundColor;
	
	public Movie(PImage poster, String title, String cast, String genre, String duration, String imdbRating, String mpaaRating,
			String mpassWarningMessage, String synopsis, ArrayList<showTime> showTimes, int currentMovie)
	{
		super("Movies", (int)(45 + ((currentMovie - 1 )%4)*174), (int)(20 +  Math.floor((currentMovie-1)/4)*222), 110, 210);
		x = Global.leftPanelWidth +(int)(45 + ((currentMovie - 1 )%4)*174);
		y = Global.progressBarHeight  + (int)(20 +  Math.floor((currentMovie-1)/4)*222);
		this.poster = poster;
		this.title = title;
		this.cast = cast;
		this.genre = genre;
		this.duration = duration;
		this.imdbRating = imdbRating;
		this.mpaaRating = mpaaRating;
		this.mpaaWarningMessage = mpaaWarningMessage;
		this.synopsis = synopsis;
		this.showTimes = showTimes;
		this.currentMovie = currentMovie;
		movieFont = Global.applet.createFont("Century Gothic", 16);
		backgroundColor = Global.applet.color(221, 231, 245);
		
	}
	
	public ArrayList<showTime> closestThreeShowTimes(int minute, int hour)
	{
		int curCount = 0;
		ArrayList<showTime> closestShowTimes = new ArrayList<showTime>();
		for(int i = 0; i < showTimes.size(); ++i)
		{
			if(showTimes.get(i).hour >= Global.hour && showTimes.get(i).minute >= Global.minute)
			{
				closestShowTimes.add(showTimes.get(i));
				++curCount;
				if(curCount == 3)
				{
					break;
				}
			}
		}
		
		
		return closestShowTimes;
	}	

	public void chkdraw() {
		noStroke();
		drawFuzzyRectangle(-15, -15, 140, 186, 20, 0);
		image(poster, 0, 0, 110, 156);
		fill(0);
		textAlign(CENTER);
		textFont(movieFont);
		text(title,0,162,110,44);	
		
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
	// TODO: do this directly somehow; a shader?
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
	 
	  int bgcolor = Global.applet.color(255,255,255,0);
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
