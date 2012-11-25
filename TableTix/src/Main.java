
import java.util.ArrayList;

import android.R.integer;
import processing.core.*;
import vialab.SMT.*;

public class Main extends PApplet 
{
	  int loaded = 0;
	  Zone loadingZone;
	  //Set preLoad to true if you want to have the system render its content before it starts functioning
	  Boolean preLoad = true;
	  public void setup() 
	  {	
	    size(1024,768, P3D);
	    Global.client = new TouchClient(this, TouchSource.MOUSE);
	    Global.applet = this;
	    Global.fontCent = Global.applet.createFont("Century Gothic", 60,true);
	    textFont( Global.fontCent);
	    Global.pBar = new ProgressBar();
	    Global.leftMain = new LeftPanel();
	    Global.rightMain = new RightPanel();
	    SetMovieInfo theMovies = new SetMovieInfo();
	    Global.welcomingScreenImage = loadImage("..//Image//TableTix_Part1.png");
	    Global.loadingScreenImage = loadImage("..//Image//Loading Screen.png");
	    
	  }

	  public void draw() 
	  { 
		 if(loaded == 0 && preLoad)
		 {
			 loadingZone = new ImageZone("loading",  Global.loadingScreenImage, 0, 0, 1024,768);
			
			 Global.client.add(Global.leftMain);
			 Global.client.add(Global.rightMain);
			 Global.client.add(loadingZone);
			 for(int i = 0; i < Global.movies.length; ++i)
			 {
				   Global.rightMain.add(Global.movies[i]);
				  
			 }
			 ++loaded;
		 }
		 else if(loaded <= 12 && preLoad)
		 {
			 Global.currentMovie = Global.movies[loaded-1];
			 ++loaded;
			 
		 }
		 else if(loaded == 13 && preLoad)
		 {

			 Global.currentMovie = null;
			 for(int i = 0; i < Global.movies.length; ++i)
			 {
				   Global.rightMain.remove(Global.movies[i]);
				  
			 }
			 Global.client.remove(Global.leftMain);
			 Global.client.remove(Global.rightMain);
			 Global.client.remove(loadingZone);
			 ++loaded;
		 }
		 else {
	
		    switch (Global.currentScreen) {
			case 1:
				if(Global.lastDrawnScreen != Global.currentScreen)
			    {
					 
					 Global.client.add(Global.leftMain);
					 Global.client.add(Global.rightMain);

					for(int i = 0; i < Global.movies.length; ++i)
					{
					    Global.rightMain.add(Global.movies[i]);
					}

					 Global.pBar.SetProgressBar();
			    }
				 if(Global.popupVisible && Global.warningZone == null)
				 {
					 Global.warningZone = new WarningZone();
					 Global.client.add(Global.warningZone);
				 }
				 else if(!Global.popupVisible && Global.warningZone != null)
				 {
					 Global.client.remove(Global.warningZone);
					 Global.warningZone = null;
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
		    	if(Global.lastDrawnScreen == 1)
		    	{
		    		Global.client.remove(Global.warningZone);
					for(int i = 0; i < Global.movies.length; ++i)
					{
						   Global.rightMain.remove(Global.movies[i]);
						  
					}
		    		
		    	}
		    	Global.lastDrawnScreen = Global.currentScreen;
		    }    	
		 }
	  }
	  
	  public void touchTouchToStart(Zone z)
	  {
	      Global.currentScreen = 1;
	  }
	   
	  
	  public void drawRightPanel(RightPanel z)
	  {
		  z.chkDraw();
	  }
	  
	  public void drawMovies(Movie z)
	  {
		 z.chkdraw();
	  }

	  public void drawNavButton(ImageZone z)
	  {
		 Global.rightMain.chkDrawNavButton(z);
	  }
	  
	  public void drawWarningZone(WarningZone z)
	  {
		  z.chkDraw();
	  }
	  
	  public void drawTicketSelect(TicketSelect z)
		 {
			 z.chkDraw();
		 }
	  
	  public void drawWarningButton(Zone z)
	  {
		  Global.warningZone.chkDrawWarningButton(z);
	  }
	  
	  public void touchMovies(Movie z)
	  {
		  //Global.client.putZoneOnTop(z);
		  //z.rst(false, true, true); 	
		  Global.currentMovie = z;
	  }
	  
	  public void touchNavButton(ImageZone z)
	  {
		 Global.rightMain.chkTouchNavButton(z);
	  }
	  
	 public void touchTicketSelect(TicketSelect z)
	 {
		 z.chkTouch();
	 }
	  
	  public void touchLeftMain(Zone z)
	  {
		  if(Global.currentMovie != null)
		  {
			  Global.popupVisible = true;
		  }
	  }
	  public void touchWarningButton(Zone z)
	  {
		  Global.warningZone.chkTouchWarningButton(z);
	  }
	}