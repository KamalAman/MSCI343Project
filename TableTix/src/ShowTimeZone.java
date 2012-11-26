import java.util.ArrayList;

import android.R.integer;

import vialab.SMT.*;

public class ShowTimeZone extends Zone
{
	int y;
	int lastDrawnScreen = -1;
	Movie selectedMovie;
	public ArrayList<ShowTimeButtons> showTimeList;
	public ShowTimeZone() 
	{
		super("ShowTimeZone", 10, 0, 300,100);
	}
	public void chkDraw()
	{
		if(Global.currentMovie != null && (Global.currentScreen != lastDrawnScreen || selectedMovie != Global.currentMovie) && Global.currentScreen != 0)
		{
			if(Global.currentScreen == 1)
			{
				y=640;
			}
			else {
				y = 340;
			}
			lastDrawnScreen = Global.currentScreen;
			selectedMovie = Global.currentMovie;
			ArrayList<ShowTime> closestTimes = Global.currentMovie.closestThreeShowTimes(Global.hour, Global.minute);
			if(showTimeList != null)
			{
				for (int i = 0; i < showTimeList.size(); ++i)
				{
					Global.client.remove(showTimeList.get(i));
				}
			}
			showTimeList = new ArrayList<ShowTimeButtons>();
			String displayShowTimeString;
			for (int i = 0; i < closestTimes.size(); ++i)
			{		
				 displayShowTimeString = closestTimes.get(i).hour + ":" + closestTimes.get(i).minute + " PM";
				 showTimeList.add(new ShowTimeButtons(displayShowTimeString, i, y));
				 Global.client.add(showTimeList.get(i));
			}	
		}
		if(Global.currentScreen == 5)
		{
			if(showTimeList != null)
			{
				for (int i = 0; i < showTimeList.size(); ++i)
				{
					Global.client.remove(showTimeList.get(i));
					
				}
				showTimeList = null;
			}
		}
	}

}
