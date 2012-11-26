import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

import android.R.integer;
import android.R.string;

import processing.*;
import processing.core.PImage;
import vialab.SMT.Zone;

public class ShowTimeButtons extends Zone{
	
	public int i;
	public String showTime;
	public PImage showTimeButton = Global.applet.loadImage("..//Image/Buttons//showtime unpressed.png");
	
	public ShowTimeButtons(String showTime, int i, int y)
	{
		
		super("ShowTimeButton", 8 + (i%3)*(90 + 5),(int)(y + Math.floor(i/3)*40),90, 36);
		this.i = i;
		this.showTime = showTime; 
		
	}
	
	public void chkDraw() 
	{
		if(Global.currentScreen == 1)
		{
			image(showTimeButton, 0, 0, width, height);
		}
		else 
		{
			noStroke();
			if(Global.currentShowTime.equals(this.showTime))
			{
				fill(128,182,15);
			}
			else 
			{
				fill(125,125,125);
			}
			rect(0, 0, width, height, 5);
		}
		textAlign(CENTER);
		fill(0);
		textSize(12);
		text(showTime, 0, 14, width, 30);
	}
}
