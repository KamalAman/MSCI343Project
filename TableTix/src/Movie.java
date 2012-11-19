
import java.awt.List;
import java.util.*;

import javax.swing.Box.Filler;

import android.R.drawable;
import android.R.integer;
import android.util.Pair;
import processing.core.PFont;
import processing.core.PImage;
import sun.net.www.content.audio.x_aiff;
import vialab.SMT.Zone;


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
	PFont movieFont;
	
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
		movieFont = Global.applet.createFont("Century Gothic", 20, true);
		
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
		image(poster, 0, 0, 110, 156);
		fill(0);
		textAlign(CENTER);
		textFont(movieFont);
		text(title,0,162,110,60);	
		
	}



}
