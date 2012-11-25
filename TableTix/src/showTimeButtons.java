import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

import android.R.integer;
import android.R.string;

import processing.*;
import processing.core.PImage;
import vialab.SMT.Zone;

public class showTimeButtons extends Zone{
	//int to represent state: 0,1,2,3
	//check state, 
		//showtime and string for text
		//public sTimes
	public int currShowTimeNum;
	public string selectedShow;
	public PImage showTimeButton = Global.applet.loadImage("..//Image/Buttons//showtime unpressed.png");
	
	public showTimeButtons(String selectedShow, int currShowTimeNum)
	{
		super("ShowTimes",10 + currShowTimeNum*(56 + 10),650,80,56);
		this.currShowTimeNum = currShowTimeNum;
		
	}
	
	public void chkDraw() {
	
		
	}
}
