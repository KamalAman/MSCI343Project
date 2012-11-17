
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
	public List showTimes = new List();
	
	public Movie(PImage poster, String title, String cast, String genre, String duration, String imdbRating,
			String mpassWarningMessage, String synopsis, List showTimes)
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
	
	/*public List closestThreeShowTimes(int minute, int hour)
	{
		ArrayList<showTime> closestShowTimes = new List<showTime>();
		
		
		
		return closestShowTimes;
	}*/
}
