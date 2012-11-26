import java.util.HashMap;

import javax.media.nativewindow.VisualIDHolder.VIDComparator;

import android.R.integer;

import processing.core.PImage;

import vialab.SMT.Zone;


public class CircleButton extends Zone
{
	// The radius of a circle
	float r = 84;
	// The width and height of the boxes
	int w = 66;
	int h = 66;
	HashMap<Zone,String> numCicle = new HashMap<Zone, String>();
	Zone[] numArray = new Zone[8];
	PImage circleImage;
	public TicketSelect currentTicket;
	public CircleButton() 
	{
		super("CircleButton",174,4,198,198);
		circleImage = Global.applet.loadImage("..//Image//Circle Button.png");
		// 8 boxes along the curve
		  int totalBoxes = 8;
		  // We must keep track of our position along the curve
		  float arclength = -161;
		   
		  // For every box
		  for (int i = 0; i < totalBoxes; i++) 
		  {
		    arclength += w/2;  
		    float theta = arclength / r;     
		    fill(0,100);
		    rectMode(CENTER);  
		    numArray[i]= new Zone("CircleNumber", (int)(width / 2 - w/2 + r*Global.applet.cos(theta)), (int)(height / 2 - h/2 + r*Global.applet.sin(theta)), 70,70); 
		    this.add(numArray[i]);
		    numCicle.put( numArray[i], Integer.toString(i));
		    arclength += w/2;
		  }
	}

	public void chkDraw()
	{
		image(circleImage, 0, 0, width, height);
	}
	public void chkTouchCircleNumber(Zone z)
	{
		if(Global.currectTicketSelected.ticketType == Global.generalString)
		{
			Global.generalTicketQuantity = Integer.parseInt(numCicle.get(z));
		}
		else if(Global.currectTicketSelected.ticketType == Global.childString)
		{
			Global.childTicketQuantity = Integer.parseInt(numCicle.get(z));
		}
		else if (Global.currectTicketSelected.ticketType == Global.seniorString)
		{
			Global.seniorTicketQuantity = Integer.parseInt(numCicle.get(z));
		}
	}
}
