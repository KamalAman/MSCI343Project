
import processing.core.*;
import vialab.SMT.*;

public class Main extends PApplet 
{

	  
	  public void setup() 
	  {	
	    size(1024,768, P3D);
	    Global.client = new TouchClient(this, TouchSource.MOUSE);
	    Global.applet = this;
	    Global.pBar = new ProgressBar();
	    Global.leftMain = new LeftPanel();
	    Global.rightMain = new RightPanel();
	    Global.welcomingScreenImage = loadImage("..//Image//TableTix_Part1.png");
	  }

	  public void draw() 
	  { 
	    switch (Global.currentScreen) {
		case 1:
			if(Global.lastDrawnScreen != Global.currentScreen)
		    {
				 
				 Global.client.add(Global.leftMain);
				 Global.client.add(Global.rightMain);
				 Global.pBar.SetProgressBar();
		    }
			
			break;
		case 2:
			if(Global.lastDrawnScreen != Global.currentScreen)
		    {
				Global.pBar.SetProgressBar();
		    }
			
			//ticket selection screen
			break;
		case 3:
			if(Global.lastDrawnScreen != Global.currentScreen)
		    {
				Global.pBar.SetProgressBar();
		    }
			
			//Concession Screen
			break;
		case 4:
			if(Global.lastDrawnScreen != Global.currentScreen)
		    {
				Global.pBar.SetProgressBar();
		    }
			
			//Check out screen
			break;
		case 5:
			if(Global.lastDrawnScreen != Global.currentScreen)
		    {
				Global.pBar.RemoveProgressBar();
		    }
			
			//Ticket Printing Screen
			//pause for 5 seconds and witch currentScreen to 0
			break;		
		default:
			if(Global.lastDrawnScreen != Global.currentScreen)
		    {
				Global.fullScreenZone = new ImageZone("TouchToStart",  Global.welcomingScreenImage, 0, 0, 1024,768);
				Global.client.add(Global.fullScreenZone);
				Global.pBar.RemoveProgressBar();
		    }
			//Welcome screen
			//check if variables are cleared, clear them if they are not
			break;
		}
	    if(Global.lastDrawnScreen != Global.currentScreen)
	    {
	    	//deactivate last screen
	    	if(Global.lastDrawnScreen == 0)
	    	{
	    		Global.client.remove(Global.fullScreenZone);
	    	}
	    	Global.lastDrawnScreen = Global.currentScreen;
	    }
	    	
	  }
	  
	  public void touchTouchToStart(Zone z)
	  {
	      Global.currentScreen = 1;
	  }
	  
	}