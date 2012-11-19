
import java.awt.List;
import java.util.*;

import android.R.integer;
import android.util.Pair;
import processing.core.PImage;


public class Movie {
	public PImage poster; 
	public String title;
	public String cast;
	public String genre;
	public String duration;
	public String imdbRating;
	public String mpaaRating;
	public String mpaaWarningMessage;
	public String synopsis;
	public ArrayList<showTime> showTimes;
	
	public Movie(PImage poster, String title, String cast, String genre, String duration, String imdbRating, String mpaaRating,
			String mpassWarningMessage, String synopsis, ArrayList<showTime> showTimes)
	{
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
}
